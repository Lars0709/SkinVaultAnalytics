package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.model.*;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
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

    public String createCollections(List<Collection> collections) {

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
        }

        // remove double/triple keys
        KeyService keyService = new KeyService();
        keyService.removeDoubledKeys();


        return "Added all Collections successfully!";
    }

    public List<Collection> getAllCollections() {

        List<Collection> collections = collectionRepository.findAll();

        for (Collection collection : collections) {

            if (collection.getSkins() != null) {
                collection.getSkins().sort(Comparator.comparingLong(Skin::getId));
            }
            if (collection.getAgents() != null) {
                collection.getAgents().sort(Comparator.comparingLong(Agent::getId));
            }
            if (collection.getPatches() != null) {
                collection.getPatches().sort(Comparator.comparingLong(Patch::getId));
            }
            if (collection.getPins() != null) {
                collection.getPins().sort(Comparator.comparingLong(Pin::getId));
            }
            if (collection.getGraffitis() != null) {
                collection.getGraffitis().sort(Comparator.comparingLong(Graffiti::getId));
            }
            if (collection.getStickers() != null) {
                collection.getStickers().sort(Comparator.comparingLong(Sticker::getId));
            }

        }

        return collections;
    }

    public Optional<Collection> getCollectionById(Long id) {
        return collectionRepository.findById(id);
    }

    public void deleteCollectionById(Long id) {
        collectionRepository.deleteById(id);
    }
}

