package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository collectionRepository;

    // Create new Collection
    public Collection createCollection(Collection collection){
        return collectionRepository.save(collection);
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

