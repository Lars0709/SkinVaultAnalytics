package com.csInventoryIntellect.SkinVaultAnalytics.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "collection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collection {


    public Collection(String collectionName, int releaseYear, String collectionType,
                      @Nullable List<Skin> skins, @Nullable List<Sticker> stickers, @Nullable List<Graffiti> graffitis,
                      @Nullable List<Agent> agents, @Nullable List<Patch> patches, @Nullable List<Pin> pins,
                      @Nullable List<MusicKit> musicKits) {

        this.collectionName = collectionName;
        this.releaseYear = releaseYear;
        this.collectionType = collectionType;
        this.skins = skins;
        this.stickers = stickers;
        this.graffitis = graffitis;
        this.agents = agents;
        this.patches = patches;
        this.pins = pins;
        this.musicKits = musicKits;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collectionName;
    private int releaseYear;
    private String collectionType;

    @Nullable
    @OneToMany
    @JoinColumn(name = "skin_collection_id", nullable = false)
    private List<Skin> skins;

    @Nullable
    @OneToMany
    @JoinColumn(name = "sticker_collection_id", nullable = false)
    private List<Sticker> stickers;

    @Nullable
    @OneToMany
    @JoinColumn(name = "graffiti_collection_id", nullable = false)
    private List<Graffiti> graffitis;

    @Nullable
    @OneToMany
    @JoinColumn(name = "agent_collection_id", nullable = false)
    private List<Agent> agents;

    @Nullable
    @OneToMany
    @JoinColumn(name = "patch_collection_id", nullable = false)
    private List<Patch> patches;

    @Nullable
    @OneToMany
    @JoinColumn(name = "pin_collection_id", nullable = false)
    private List<Pin> pins;

    @Nullable
    @OneToMany
    @JoinColumn(name = "musicKit_collection_id", nullable = false)
    private List<MusicKit> musicKits;

}
