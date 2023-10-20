package com.csInventoryIntellect.SkinVaultAnalytics.controller.postmanController;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postmanCollections")
public class CollectionPostmanController {

    @Autowired
    private CollectionService collectionService;

    @PostMapping
    public ResponseEntity<String> createCollection(@RequestBody List<Collection> collections){

        String output = collectionService.createCollection(collections);

        return new ResponseEntity<>(output, HttpStatus.OK);
    }

    @GetMapping
    public List<Collection> getAllCollections(){
        return collectionService.getAllCollections();
    }

    @GetMapping("/{id}")
    public Optional<Collection> getCollectionById(@PathVariable Long id){
        return collectionService.getCollectionById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCollectionById(@PathVariable Long id){
        collectionService.deleteCollectionById(id);
    }

}
