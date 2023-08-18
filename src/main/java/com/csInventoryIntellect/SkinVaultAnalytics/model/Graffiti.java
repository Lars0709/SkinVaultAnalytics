package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "graffitis")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Graffiti {

    public Graffiti (String graffitiName, String rarity, String type){
        this.graffitiName = graffitiName;
        this.rarity = rarity;
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String graffitiName;
    private String rarity;
    private String type;

}
