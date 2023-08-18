package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Container;
import com.csInventoryIntellect.SkinVaultAnalytics.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/containers")
public class ContainerController {

    @Autowired
    private ContainerService containerService;

    @PostMapping
    public ResponseEntity<String> createContainers(@RequestBody List<Container> containers){

        String output = containerService.createContainers(containers);

        return new ResponseEntity<>(output, HttpStatus.OK);
    }

    @GetMapping
    public List<Container> getAllContainers(){
        return containerService.getAllContainers();
    }

}

