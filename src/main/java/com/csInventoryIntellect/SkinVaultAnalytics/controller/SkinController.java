package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.repository.SkinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class SkinController {

    private final SkinRepository skinRepository;

    @GetMapping(value ="/skins")
    private String websiteSkinsPage(Model model) {

        model.addAttribute("skins", skinRepository.findAll());

        return "skins";
    }

    @GetMapping(value ="/skin/{id}")
    private String specificSkinPage(@PathVariable Long id, Model model) {

        model.addAttribute("skin", skinRepository.findById(id));

        return "skin";
    }

}
