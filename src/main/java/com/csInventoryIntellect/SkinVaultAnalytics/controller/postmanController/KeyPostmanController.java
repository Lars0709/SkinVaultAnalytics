package com.csInventoryIntellect.SkinVaultAnalytics.controller.postmanController;


import com.csInventoryIntellect.SkinVaultAnalytics.model.Key;
import com.csInventoryIntellect.SkinVaultAnalytics.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postmanKeys")
public class KeyPostmanController {

    @Autowired
    private KeyService keyService;

    @GetMapping
    public List<Key> getAllKeys(){
        return keyService.getAllKeys();
    }
}
