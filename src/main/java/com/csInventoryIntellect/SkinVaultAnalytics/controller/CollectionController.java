package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.CollectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class CollectionController {

    private final CollectionRepository collectionRepository;

    @GetMapping(value = "/collections")
    private String allCollectionsMain(Model model){

        List<Collection> collections = collectionRepository.searchByCollectionTypeContainingIgnoreCase("skins-collection");
        model.addAttribute("collections", collections);

        return "collections";
    }

    @GetMapping(value = "/collection/{id}")
    private String collectionSpecificPage(Model model, @PathVariable(value = "id") Long id) {


        Optional<Collection> collection = collectionRepository.findById(id);

        if (collection.isPresent()){
            model.addAttribute("collection", collection);
        }

        return "specificCollectionSkins";
    }

}
