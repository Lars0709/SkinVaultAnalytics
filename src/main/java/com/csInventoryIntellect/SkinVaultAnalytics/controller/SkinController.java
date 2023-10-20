package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.repository.SkinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class SkinController {

    private final SkinRepository skinRepository;

    @GetMapping(value ="/skins")
    private String websiteSkinsPage(Model model) {

        model.addAttribute("skins", skinRepository.findAll());

        return "skins";
    }
}
