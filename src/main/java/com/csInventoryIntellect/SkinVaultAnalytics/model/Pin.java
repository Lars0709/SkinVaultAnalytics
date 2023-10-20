package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "pins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pin {

    public Pin(String pinName, String rarity, @Nullable String pinImage) {
        this.pinName = pinName;
        this.rarity = rarity;
        this.pinImage = pinImage;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pinName;
    private String rarity;
    @Nullable
    private String pinImage;

}