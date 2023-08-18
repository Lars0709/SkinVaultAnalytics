package com.csInventoryIntellect.SkinVaultAnalytics.controller;


import com.csInventoryIntellect.SkinVaultAnalytics.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/keys")
public class KeyController {

    @Autowired
    private KeyService keyService;
}
