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

    public Skin(String skinName, String rarity, double minWear, double maxWear, String gunType,
                boolean statTrakPossible, boolean souvenirPossible, boolean stickerSlotOnePossible,
                boolean stickerSlotTwoPossible, boolean stickerSlotThreePossible, boolean stickerSlotFourPossible,
                boolean stickerSlotFivePossible) {

        this.skinName = skinName;
        this.rarity = rarity;
        this.minWear = minWear;
        this.maxWear = maxWear;
        this.gunType = gunType;
        // this.collection = collection;
        this.statTrakPossible = statTrakPossible;
        this.souvenirPossible = souvenirPossible;
        this.stickerSlotOnePossible = stickerSlotOnePossible;
        this.stickerSlotTwoPossible = stickerSlotTwoPossible;
        this.stickerSlotThreePossible = stickerSlotThreePossible;
        this.stickerSlotFourPossible = stickerSlotFourPossible;
        this.stickerSlotFivePossible = stickerSlotFivePossible;
    }

    // sticker & collection verlinken mit deren db über id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skinName;
    private String rarity;
    private double minWear;
    private double maxWear;
    private String gunType;
    // private Collection collection;
    private boolean statTrakPossible;
    private boolean souvenirPossible;
    private boolean stickerSlotOnePossible;
    private boolean stickerSlotTwoPossible;
    private boolean stickerSlotThreePossible;
    private boolean stickerSlotFourPossible;
    private boolean stickerSlotFivePossible;


}