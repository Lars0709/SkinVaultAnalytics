package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Entity(name = "container")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Container {

    public Container(Collection collection, int numberOfItems, String rarities, int yearOfRelease) {

        this.collection = collection;
        this.numberOfItems = numberOfItems;
        this.rarities = rarities;
        this.yearOfRelease = yearOfRelease;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;

    private int numberOfItems;

    private String rarities;

    private int yearOfRelease;

}
