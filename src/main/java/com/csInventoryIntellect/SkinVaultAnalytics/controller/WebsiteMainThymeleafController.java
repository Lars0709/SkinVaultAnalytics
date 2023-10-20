package com.csInventoryIntellect.SkinVaultAnalytics.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebsiteMainThymeleafController {

    @GetMapping(value = "/")
    private String websiteIndexPage(){
        return "index";
    }
}
