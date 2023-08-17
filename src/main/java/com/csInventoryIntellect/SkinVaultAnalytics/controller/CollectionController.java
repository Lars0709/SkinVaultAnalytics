package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/collections")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    // Create new collection
    @PostMapping
    public Collection createCollection(@RequestBody Collection collection){
        return collectionService.createCollection(collection);
    }

    // Get all skins
    @GetMapping
    public List<Collection> getAllCollections(){
        return collectionService.getAllCollections();
    }

    // Get collection by id
    @GetMapping("/{id}")
    public Optional<Collection> getCollectionById(@PathVariable Long id){
        return collectionService.getCollectionById(id);
    }

    // Delete collection by id
    @DeleteMapping("/{id}")
    public void deleteCollectionById(@PathVariable Long id){
        collectionService.deleteCollectionById(id);
    }

}
