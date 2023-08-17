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


    public Collection(String collectionName, int numberOfItems, int releaseYear, String collectionType,
                      @Nullable List<Skin> skins, @Nullable List<Sticker> stickers, @Nullable List<Graffiti> graffitis,
                      @Nullable List<Agent> agents, @Nullable List<Patch> patches, @Nullable List<Pin> pins) {

        this.collectionName = collectionName;
        this.numberOfItems = numberOfItems;
        this.releaseYear = releaseYear;
        this.collectionType = collectionType;
        this.skins = skins;
        this.stickers = stickers;
        this.graffitis = graffitis;
        this.agents = agents;
        this.patches = patches;
        this.pins = pins;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collectionName;
    private int numberOfItems;
    private int releaseYear;
    private String collectionType;

    @Nullable
    @OneToMany
    @JoinColumn(name = "skin_id", nullable = false)
    private List<Skin> skins;

    @Nullable
    @OneToMany
    @JoinColumn(name = "sticker_id", nullable = false)
    private List<Sticker> stickers;

    @Nullable
    @OneToMany
    @JoinColumn(name = "graffiti_id", nullable = false)
    private List<Graffiti> graffitis;

    @Nullable
    @OneToMany
    @JoinColumn(name = "agent_id", nullable = false)
    private List<Agent> agents;

    @Nullable
    @OneToMany
    @JoinColumn(name = "patch_id", nullable = false)
    private List<Patch> patches;

    @Nullable
    @OneToMany
    @JoinColumn(name = "pin_id", nullable = false)
    private List<Pin> pins;

}
