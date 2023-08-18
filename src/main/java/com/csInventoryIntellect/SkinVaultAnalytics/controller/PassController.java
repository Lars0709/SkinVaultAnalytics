package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Pass;
import com.csInventoryIntellect.SkinVaultAnalytics.service.PassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passes")
public class PassController {

    @Autowired
    private PassService passService;

    @GetMapping
    public List<Pass> getAllPasses(){
        return passService.getAllPasses();
    }
}
