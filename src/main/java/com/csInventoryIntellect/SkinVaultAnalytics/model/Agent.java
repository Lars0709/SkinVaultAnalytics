package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "agents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {

    public Agent(String agentName,String rarity, String type,@Nullable String agentImage) {
        this.agentName = agentName;
        this.rarity = rarity;
        this.type = type; // ct or t side
        this.agentImage = agentImage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String agentName;
    private String rarity;
    private String type;
    @Nullable
    @Column(length = 1000)
    private String agentImage;

}
