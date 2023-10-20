package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "sticker")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sticker {

    public Sticker(String stickerName, String finish, String rarity, String type,@Nullable String stickerImage) {
        this.stickerName = stickerName;
        this.finish = finish; // paper, glitter, holo, foil gold
        this.rarity = rarity; // blue, purple, pink, red, contraband
        this.type = type; // major sticker, operation sticker, standard capsule
        this.stickerImage = stickerImage;

    }

    // many to many

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stickerName;
    private String finish;
    private String rarity;
    private String type;
    @Nullable
    private String stickerImage;

}
