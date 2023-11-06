package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "graffitis")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Graffiti {

    public Graffiti (String graffitiName, String rarity, @Nullable List<String> colors, String type, @Nullable String graffitiImage){
        this.graffitiName = graffitiName;
        this.rarity = rarity;
        this.colors = colors;
        this.type = type;
        this.graffitiImage = graffitiImage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String graffitiName;
    private String rarity;
    @Nullable
    private List<String> colors;
    private String type;
    @Nullable
    @Column(length = 1000)
    private String graffitiImage;

}
