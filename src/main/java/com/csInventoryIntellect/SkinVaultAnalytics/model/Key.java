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

    public Key(String keyName, Container container) {

        this.keyName = keyName;
        this.container = container;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyName;
    @ManyToOne
    @JoinColumn(name = "container_id")
    private Container container;

}
