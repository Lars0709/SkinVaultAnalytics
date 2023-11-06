package com.csInventoryIntellect.SkinVaultAnalytics.controller.postmanController;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.service.CollectionService;
import com.csInventoryIntellect.SkinVaultAnalytics.service.DataFromSteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/postmanCollections")
public class CollectionPostmanController {

    @Autowired
    private CollectionService collectionService;

    @Autowired
    private DataFromSteamService dataFromSteamService;

    @PostMapping
    public ResponseEntity<String> createCollection(@RequestBody List<Collection> collections){

        String output = collectionService.createCollections(collections);

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

    @GetMapping("/createSkinImages")
    public ResponseEntity<String> createImagesForSkins() throws IOException {

        dataFromSteamService.createLinksForSkinImages();

        return new ResponseEntity<>("Top läuft!", HttpStatus.OK);
    }

    @GetMapping("/createAgentImages")
    public ResponseEntity<String> createImagesForAgents() throws IOException {

        dataFromSteamService.createLinksForAgentImages();

        return new ResponseEntity<>("Top läuft!", HttpStatus.OK);
    }

}
