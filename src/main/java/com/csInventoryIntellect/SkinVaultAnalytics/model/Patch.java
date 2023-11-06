package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "patches")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patch {

    public Patch(String patchName, String rarity, @Nullable String patchImage) {
        this.patchName = patchName;
        this.rarity = rarity;
        this.patchImage = patchImage;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patchName;
    private String rarity;
    @Nullable
    @Column(length = 1000)
    private String patchImage;

}