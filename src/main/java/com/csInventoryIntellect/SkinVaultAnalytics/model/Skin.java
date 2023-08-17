package com.csInventoryIntellect.SkinVaultAnalytics.model;

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

    public Skin(String skinName, String rarity, double minWear, double maxWear, String gunType, String finishStyle,
                boolean statTrakPossible, boolean souvenirPossible, boolean stickerSlotOnePossible,
                boolean stickerSlotTwoPossible, boolean stickerSlotThreePossible, boolean stickerSlotFourPossible,
                boolean stickerSlotFivePossible) {

        this.skinName = skinName;
        this.rarity = rarity; // blue, purple, pink, red, gold, contraband
        this.minWear = minWear; // 0
        this.maxWear = maxWear; // 1
        this.gunType = gunType; // knife, gloves, all gun types
        this.finishStyle = finishStyle; // pattern based etc.
        this.statTrakPossible = statTrakPossible;
        this.souvenirPossible = souvenirPossible;
        this.stickerSlotOnePossible = stickerSlotOnePossible;
        this.stickerSlotTwoPossible = stickerSlotTwoPossible;
        this.stickerSlotThreePossible = stickerSlotThreePossible;
        this.stickerSlotFourPossible = stickerSlotFourPossible;
        this.stickerSlotFivePossible = stickerSlotFivePossible;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skinName;
    private String rarity;
    private double minWear;
    private double maxWear;
    private String gunType;
    private String finishStyle;
    private boolean statTrakPossible;
    private boolean souvenirPossible;
    private boolean stickerSlotOnePossible;
    private boolean stickerSlotTwoPossible;
    private boolean stickerSlotThreePossible;
    private boolean stickerSlotFourPossible;
    private boolean stickerSlotFivePossible;


}