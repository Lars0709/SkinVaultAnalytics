package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private MusicKitRepository musicKitRepository;


    // Create new Collection
    public String createCollection(List<Collection> collections){

        collectionRepository.saveAll(collections);

        for (Collection collection : collections){

            if (collection.getSkins() != null){
                skinRepository.saveAll(collection.getSkins());
            }

            if (collection.getStickers() != null){
                stickerRepository.saveAll(collection.getStickers());
            }

            if (collection.getAgents() != null){
                agentRepository.saveAll(collection.getAgents());
            }

            if (collection.getPins() != null){
                pinRepository.saveAll(collection.getPins());
            }

            if (collection.getPatches() != null){
                patchRepository.saveAll(collection.getPatches());
            }

            if (collection.getGraffitis() != null){
                graffitiRepository.saveAll(collection.getGraffitis());
            }

            if (collection.getMusicKits() != null){
                musicKitRepository.saveAll(collection.getMusicKits());
            }

        }

        return "Added all Collections successfully!";
    }

    // Get all Collections
    public List<Collection> getAllCollections(){
        return collectionRepository.findAll();
    }

    // Get collection by ID
    public Optional<Collection> getCollectionById(Long id){
        return collectionRepository.findById(id);
    }

    // Delete collection by ID
    public void deleteCollectionById(Long id){
        collectionRepository.deleteById(id);
    }
}

