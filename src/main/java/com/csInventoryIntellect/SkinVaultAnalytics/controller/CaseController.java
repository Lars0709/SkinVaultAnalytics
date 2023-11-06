package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Skin;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.CollectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class CaseController {

    private final CollectionRepository collectionRepository;

    @GetMapping(value = "/cases")
    private String allCasesMain(Model model){

        List<Collection> weaponCases = collectionRepository.searchByCollectionTypeContainingIgnoreCase("skins-case");
        model.addAttribute("weaponCases", weaponCases);

        return "cases";
    }

    @GetMapping(value = "/case/{id}")
    private String collectionSpecificPage(@PathVariable Long id, Model model) {

        Optional<Collection> collection = collectionRepository.findById(id);
        collection.ifPresent(c -> {
            assert c.getSkins() != null;
            c.getSkins().sort(Comparator.comparingLong(Skin::getId).reversed());
        });


        if (collection.isPresent()){
            model.addAttribute("collection", collection);
        }

        return "specificCollectionSkins";
    }

}
