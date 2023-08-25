package com.csInventoryIntellect.SkinVaultAnalytics.controller;


import com.csInventoryIntellect.SkinVaultAnalytics.model.IndividualAgent;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.IndividualAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/individualAgents")
public class IndividualAgentController {

    @Autowired
    private IndividualAgentRepository individualAgentRepository;


    @GetMapping
    public List<IndividualAgent> viewAllIndividualAgents(){
        return individualAgentRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addIndividualAgent(@RequestBody IndividualAgent individualAgent){

        String output = individualAgentRepository.save(individualAgent).toString();

        return new ResponseEntity<>(output, HttpStatus.ACCEPTED);
    }

}
