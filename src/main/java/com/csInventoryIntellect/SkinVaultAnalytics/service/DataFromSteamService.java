package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Agent;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Skin;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.*;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class DataFromSteamService {

    @Autowired
    private SkinRepository skinRepository;

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private StickerRepository stickerRepository;

    @Autowired
    private PinRepository pinRepository;

    @Autowired
    private PatchRepository patchRepository;

    @Autowired
    private GraffitiRepository graffitiRepository;

    public void createLinksForSkinImages() throws IOException {

        List<Skin> skins = skinRepository.findAll();
        for (Skin skin : skins) {

            if(skin.getSkinImage() == null){

                StringBuilder url = new StringBuilder();

                url.append("https://steamcommunity.com/market/listings/730/");

                url.append(skin.getGunName());
                url.append("%20%7C%20");
                url.append(skin.getSkinName());
                url.append("%20%28");

                if (skin.getMinWear() < 0.07) {
                    url.append("Factory%20New%29");
                } else if (skin.getMinWear() < 0.15 && skin.getMinWear() >= 0.07) {
                    url.append("Minimal%20Wear%29");
                } else if (skin.getMinWear() < 0.38 && skin.getMinWear() >= 0.15) {
                    url.append("Field-Tested%29");
                } else if (skin.getMinWear() < 0.45 && skin.getMinWear() >= 0.38) {
                    url.append("Well-Worn%29");
                } else {
                    url.append("Battle-Scarred%29");
                }

                String urlDone = url.toString().replace(" ", "%20");

                boolean requestSucceeded = false;
                int retryCount = 0;

                while (!requestSucceeded && retryCount < 5) {
                    try {
                        Document doc = Jsoup.connect(urlDone).get();
                        Elements imgElements = doc.select("img[src*=360fx360f]");

                        if (!imgElements.isEmpty()) {
                            String imgUrl = imgElements.get(0).attr("src");
                            skin.setSkinImage(imgUrl);
                            System.out.println(imgUrl);
                            skinRepository.save(skin);
                            requestSucceeded = true;
                        } else {
                            // Handle the case when no image is found
                            skin.setSkinImage("error couldnt find url");
                            skinRepository.save(skin);
                        }
                    } catch (HttpStatusException e) {
                        if (e.getStatusCode() == 429) {
                            // Wait for 2min before retrying
                            try {
                                Thread.sleep(120000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            retryCount++;
                        } else {
                            // Handle other HTTP status errors
                            // You can add more specific error handling here if needed
                            e.printStackTrace();
                            break; // Exit the loop in case of other errors
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        // Handle other IO errors
                        break; // Exit the loop in case of IO errors
                    }
                }
            }

            }
    }

    public void createLinksForAgentImages() throws IOException {

        List<Agent> agents = agentRepository.findAll();
        for (Agent agent : agents) {

            if(agent.getAgentImage() == null){

                String url = "https://steamcommunity.com/market/listings/730/" + agent.getAgentName();
                String urlDone = url.replace(" ", "%20")
                                    .replace("|", "%7C")
                                    .replace("'", "%27");

                System.out.println(urlDone);

                boolean requestSucceeded = false;
                int retryCount = 0;

                while (!requestSucceeded && retryCount < 5) {
                    try {
                        Document doc = Jsoup.connect(urlDone).get();
                        Elements imgElements = doc.select("img[src*=360fx360f]");

                        if (!imgElements.isEmpty()) {
                            String imgUrl = imgElements.get(0).attr("src");
                            agent.setAgentImage(imgUrl);
                            System.out.println(imgUrl);
                            agentRepository.save(agent);
                            requestSucceeded = true;
                        } else {
                            // Handle the case when no image is found
                            agent.setAgentImage("error couldnt find url");
                            agentRepository.save(agent);
                        }
                    } catch (HttpStatusException e) {
                        if (e.getStatusCode() == 429) {
                            // Wait for 2min before retrying
                            try {
                                Thread.sleep(120000);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                            retryCount++;
                        } else {
                            // Handle other HTTP status errors
                            // You can add more specific error handling here if needed
                            e.printStackTrace();
                            break; // Exit the loop in case of other errors
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        // Handle other IO errors
                        break; // Exit the loop in case of IO errors
                    }
                }
            }
        }
    }


}