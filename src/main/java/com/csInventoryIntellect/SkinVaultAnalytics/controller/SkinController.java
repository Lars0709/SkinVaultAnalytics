package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Skin;
import com.csInventoryIntellect.SkinVaultAnalytics.service.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/skins")
public class SkinController {

    @Autowired
    private SkinService skinService;

    // create new skin
    @PostMapping
    public Skin createSkin(@RequestBody Skin skin){
        return skinService.createSkin(skin);
    }

    // Get all skins
    @GetMapping
    public List<Skin> getAllSkins(){
        return skinService.getAllSkins();
    }

    //get skin by id
    @GetMapping("/{id}")
    public Optional<Skin> getSkinById(@PathVariable Long id){
        return skinService.getSkinById(id);
    }

    //delete skin by id
    @DeleteMapping("/{id}")
    public void deleteSkinById(@PathVariable Long id){
        skinService.deleteSkinById(id);
    }
}
