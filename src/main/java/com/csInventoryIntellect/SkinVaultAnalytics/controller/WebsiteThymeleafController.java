package com.csInventoryIntellect.SkinVaultAnalytics.controller;


import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.CollectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@AllArgsConstructor
public class WebsiteThymeleafController {

    private final CollectionRepository collectionRepository;

    @GetMapping(value = "/")
    private String websiteIndexPage(){
        return "index";
    }

    @GetMapping(value = "/collections")
    private String websiteCollectionsPage(Model model){

        model.addAttribute("collections", collectionRepository.findAll());

        return "collections";
    }


    @GetMapping(value ="/collection")
    private String websiteCollectionPage(@RequestParam(value = "id") Long id, Model model) {

        Optional<Collection> collection = collectionRepository.findById(id);

        if (collection.isPresent()){
            model.addAttribute("collection", collection.get());
        }

        return "collection";
    }

}
