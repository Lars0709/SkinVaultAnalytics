package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "skins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skin {

    public Skin(String skinName, String rarity, double minWear, double maxWear, String gunType, String gunName,
                String finishStyle, boolean statTrakPossible, boolean souvenirPossible, boolean additionalStickerPossible,
                @Nullable String skinImage, double[] skinPrices,@Nullable int skinsMarketVolume) {

        this.skinName = skinName;
        this.rarity = rarity; // blue, purple, pink, red, gold, contraband
        this.minWear = minWear; // 0
        this.maxWear = maxWear; // 1
        this.gunType = gunType; // knife, gloves, all gun types
        this.gunName = gunName;
        this.finishStyle = finishStyle; // pattern based etc.
        this.statTrakPossible = statTrakPossible;
        this.souvenirPossible = souvenirPossible;
        this.additionalStickerPossible = additionalStickerPossible;
        this.skinImage = skinImage;
        this.skinPrices = skinPrices;
        this.skinsMarketVolume = skinsMarketVolume;



    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skinName;
    private String rarity;
    private double minWear;
    private double maxWear;
    private String gunType;
    private String gunName;
    private String finishStyle;
    private boolean statTrakPossible;
    private boolean souvenirPossible;
    private boolean additionalStickerPossible;
    @Nullable
    @Column(length = 1000)
    private String skinImage;
    private double[] skinPrices = new double[10]; // Creates an array of 10 null Double elements
    @Nullable
    private int skinsMarketVolume;
}