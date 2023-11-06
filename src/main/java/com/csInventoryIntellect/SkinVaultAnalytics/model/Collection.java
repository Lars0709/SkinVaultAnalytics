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


    public Collection(String collectionName, String releaseDate, String collectionType, @Nullable String collectionImage,
                      @Nullable List<Skin> skins, @Nullable List<Sticker> stickers, @Nullable List<Graffiti> graffitis,
                      @Nullable List<Agent> agents, @Nullable List<Patch> patches, @Nullable List<Pin> pins,
                      @Nullable List<Container> containers) {

        this.collectionName = collectionName;
        this.releaseDate = releaseDate;
        this.collectionType = collectionType;
        this.collectionImage = collectionImage;
        this.containers = containers;
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
    private String releaseDate;
    private String collectionType;
    @Column(length = 1000)
    private String collectionImage;

    @Nullable
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "container_collection_id", nullable = false)
    private List<Container> containers;

    @Nullable
    @OneToMany
    @JoinColumn(name = "skin_collection_id", nullable = false)
    private List<Skin> skins;

    @Nullable
    @ManyToMany
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
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patch_collection_id", nullable = false)
    private List<Patch> patches;

    @Nullable
    @OneToMany
    @JoinColumn(name = "pin_collection_id", nullable = false)
    private List<Pin> pins;

}
