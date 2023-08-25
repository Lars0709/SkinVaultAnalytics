package com.csInventoryIntellect.SkinVaultAnalytics.controller;


import com.csInventoryIntellect.SkinVaultAnalytics.model.IndividualSkin;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.IndividualSkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/individualSkins")
public class IndividualSkinController {

    @Autowired
    private IndividualSkinRepository individualSkinRepository;


    @GetMapping
    public List<IndividualSkin> viewAllIndividualSkins() {
        return individualSkinRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addIndividualSkin(@RequestBody IndividualSkin individualSkin) {

        String output = individualSkinRepository.save(individualSkin).toString();

        return new ResponseEntity<>(output, HttpStatus.ACCEPTED);
    }

}
