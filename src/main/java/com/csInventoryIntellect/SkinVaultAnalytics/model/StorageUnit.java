package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "storageUnits")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageUnit {

    public StorageUnit (IndividualSkin individualSkin, IndividualAgent individualAgent, Miscellaneous miscellaneous,
                        Sticker sticker, Container container, Graffiti graffiti, Key key, Pass pass, Pin pin){

        this.individualSkin = individualSkin;
        this.individualAgent = individualAgent;// individual agent
        this.miscellaneous = miscellaneous;// misc
        this.sticker = sticker;// sticker
        this.container = container;// container
        this.graffiti = graffiti;// graffiti
        this.key = key;// key
        this.pass = pass;// pass
        this.pin = pin;// pin

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "individual_skin_id")
    private IndividualSkin individualSkin;
    @ManyToOne
    @JoinColumn(name = "individual_agent_id")
    private IndividualAgent individualAgent;
    @ManyToOne
    @JoinColumn(name = "miscellaneous_id")
    private Miscellaneous miscellaneous;
    @ManyToOne
    @JoinColumn(name = "sticker_id")
    private Sticker sticker;
    @ManyToOne
    @JoinColumn(name = "graffiti_id")
    private Graffiti graffiti;
    @ManyToOne
    @JoinColumn(name = "key_id")
    private Key key;
    @ManyToOne
    @JoinColumn(name = "pass_id")
    private Pass pass;
    @ManyToOne
    @JoinColumn(name = "pin_id")
    private Pin pin;
    @ManyToOne
    @JoinColumn(name = "container_id")
    private Container container;

}
