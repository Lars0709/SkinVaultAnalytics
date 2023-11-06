package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "container")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Container {

    public Container(String containerType, String containerName, boolean keyNeeded, String containerImage,
                     String containerDrop, boolean containerSupplyLimited, @Nullable Key key) {

        this.containerType = containerType;
        this.containerName = containerName;
        this.containerImage = containerImage;
        this.containerDrop = containerDrop;
        this.containerSupplyLimited = containerSupplyLimited;
        this.keyNeeded = keyNeeded;
        this.key = key;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String containerType; // case,sticker,souvenir,pin,patch,graffiti,musickit,special(x-ray/anubis)
    private String containerName;
    private String containerImage;
    private String containerDrop; // active,rare,none
    private boolean containerSupplyLimited;
    private boolean keyNeeded;

    @Nullable
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "key_id")
    private Key key;



}
