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

    public Pin (String pinName, Collection collection, String rarity){
        this.pinName = pinName;
        this.rarity = rarity;
        this.collection = collection;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pinName;
    private String rarity;

    @ManyToOne
    @JoinColumn(name="collection_id")
    private Collection collection;

}