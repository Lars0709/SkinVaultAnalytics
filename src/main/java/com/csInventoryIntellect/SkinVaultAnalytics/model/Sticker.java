package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "sticker")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sticker {

    public Sticker(String stickerName, String finish, String rarity, String type){
        this.stickerName = stickerName;
        this.finish = finish;
        this.rarity = rarity;
        this.type = type;
    }

    // many to many

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stickerName;
    private String finish;
    private String rarity;
    private String type;

    // private Collection collection;
}
