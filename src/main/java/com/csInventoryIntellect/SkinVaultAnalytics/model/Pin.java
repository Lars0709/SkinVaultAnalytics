package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "pins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pin {

    public Pin(String pinName, String rarity) {
        this.pinName = pinName;
        this.rarity = rarity;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pinName;
    private String rarity;

}