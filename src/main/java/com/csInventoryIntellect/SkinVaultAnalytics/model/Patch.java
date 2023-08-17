package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "patches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patch {

    public Patch (String patchName, Collection collection, String rarity){
        this.patchName = patchName;
        this.rarity = rarity;
        this.collection = collection;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patchName;
    private String rarity;

    @ManyToOne
    @JoinColumn(name="collection_id")
    private Collection collection;

}