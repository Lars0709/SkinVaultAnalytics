package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "container")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Container {

    public Container(String containerName, boolean obtainableNew, boolean keyNeeded, boolean dropActive) {

        this.containerName = containerName;
        this.obtainableNew = obtainableNew;
        this.keyNeeded = keyNeeded;
        this.dropActive = dropActive;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String containerName;
    private boolean obtainableNew;
    private boolean keyNeeded;
    private boolean dropActive;

}
