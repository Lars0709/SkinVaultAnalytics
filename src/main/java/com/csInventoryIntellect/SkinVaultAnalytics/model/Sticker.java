package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "sticker")
@Data
@AllArgsConstructor
public class Sticker {

    public Sticker(){
        this.stickerName = stickerName;
        this.finish = finish;
        this.rarity = rarity;
        this.type = type;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stickerName;
    private String finish;
    private String rarity;
    private String type;
    // private Collection collection;
}
