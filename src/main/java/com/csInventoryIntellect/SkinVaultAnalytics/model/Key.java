package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "keys")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Key {

    public Key(String keyName, boolean existingTradableKey, double keyPrice) {

        this.keyName = keyName;
        this.existingTradableKey = existingTradableKey;
        this.keyPrice = keyPrice;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyName;
    private boolean existingTradableKey;
    private double keyPrice;

}
