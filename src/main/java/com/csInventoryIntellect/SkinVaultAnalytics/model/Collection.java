package com.csInventoryIntellect.SkinVaultAnalytics.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.List;

@Entity(name = "collection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collection {


    public Collection(String collectionName, int numberOfItems, int releaseYear, String collectionType) {

        this.collectionName = collectionName;
        this.numberOfItems = numberOfItems;
        this.releaseYear = releaseYear;
        this.collectionType = collectionType;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String collectionName;
    private int numberOfItems;
    private int releaseYear;
    private String collectionType;

    @Nullable
    @OneToMany(mappedBy = "collection")
    private List<Skin> skins;

    @Nullable
    @OneToMany(mappedBy = "collection")
    private List<Sticker> sticker;

    @Nullable
    @OneToMany(mappedBy = "collection")
    private List<Graffiti> graffitis;

    @Nullable
    @OneToMany(mappedBy = "collection")
    private List<Agent> agents;

    @Nullable
    @OneToMany(mappedBy = "collection")
    private List<Patch> patches;

    @Nullable
    @OneToMany(mappedBy = "collection")
    private List<Pin> pins;

}
