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

    public Key(String keyName, String keyType) {

        this.keyName = keyName;
        this.keyType = keyType;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyName;
    private String keyType;

}
