package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Patch;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository collectionRepository;

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


    public String createCollection(List<Collection> collections) {

        collectionRepository.saveAll(collections);

        for (Collection collection : collections) {

            if (collection.getSkins() != null) {
                skinRepository.saveAll(collection.getSkins());
            }

            if (collection.getStickers() != null) {
                stickerRepository.saveAll(collection.getStickers());
            }

            if (collection.getAgents() != null) {
                agentRepository.saveAll(collection.getAgents());
            }

            if (collection.getPins() != null) {
                pinRepository.saveAll(collection.getPins());
            }

            if (collection.getPatches() != null) {

                // check ob patch schon da ist (pgl gold und normal 3x vorhanden)
                patchRepository.saveAll(collection.getPatches());
            }

            if (collection.getGraffitis() != null) {
                graffitiRepository.saveAll(collection.getGraffitis());
            }

            /*
            if (collection.getMusicKits() != null){
                musicKitRepository.saveAll(collection.getMusicKits());
            }
             */

        }

        return "Added all Collections successfully!";
    }

    public List<Collection> getAllCollections() {
        return collectionRepository.findAll();
    }

    public Optional<Collection> getCollectionById(Long id) {
        return collectionRepository.findById(id);
    }

    public void deleteCollectionById(Long id) {
        collectionRepository.deleteById(id);
    }
}

