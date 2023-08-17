package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "agents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {

    public Agent (String agentName,Collection collection, String rarity, String type){
        this.agentName = agentName;
        this.collection = collection;
        this.rarity = rarity;
        this.type = type; // ct or t side
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agentName;
    private String rarity;
    private String type;

    @ManyToOne
    @JoinColumn(name="collection_id")
    private Collection collection;

}
