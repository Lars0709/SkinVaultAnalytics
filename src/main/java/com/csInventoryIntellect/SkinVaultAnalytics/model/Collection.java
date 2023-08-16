package com.csInventoryIntellect.SkinVaultAnalytics.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "collection")
@Data
@AllArgsConstructor
public class Collection {

    //many to many

    public Collection() {

       this.numberOfItems = numberOfItems;
       this.releaseYear = releaseYear;
       this.collectionType = collectionType;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numberOfItems;
    private int releaseYear;
    private String collectionType;

}