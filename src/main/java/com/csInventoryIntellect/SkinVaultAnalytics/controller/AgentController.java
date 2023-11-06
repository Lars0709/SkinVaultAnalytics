package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Agent;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.AgentRepository;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.CollectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class AgentController {

    private final AgentRepository agentRepository;

    private final CollectionRepository collectionRepository;

    @GetMapping(value ="/agents")
    private String websiteAllAgentsPage(Model model) {

        List<Agent> agents = agentRepository.findAll();

        agents.sort(Comparator.comparingLong(Agent::getId));

        model.addAttribute("agents", agents);

        return "agents";
    }

    @GetMapping(value = "/agents/{id}")
    private String agentCollectionSpecificPage(Model model, @PathVariable(value = "id") Long id) {

        Optional<Collection> collection = collectionRepository.findById(id);

        collection.ifPresent(c -> {
            assert c.getAgents() != null;
            c.getAgents().sort(Comparator.comparingLong(Agent::getId));
        });


        if (collection.isPresent()){
            model.addAttribute("collection", collection);
        }

        return "specificCollectionAgents";
    }

}
