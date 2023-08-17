package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.AgentRepository;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.CollectionRepository;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.SkinRepository;
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

    // Create new Collection
    public String createCollection(List<Collection> collections){

        collectionRepository.saveAll(collections);

        for (Collection collection : collections){

            if (collection.getSkins() != null){
                skinRepository.saveAll(collection.getSkins());
            }

            if (collection.getAgents() != null){
                agentRepository.saveAll(collection.getAgents());
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

