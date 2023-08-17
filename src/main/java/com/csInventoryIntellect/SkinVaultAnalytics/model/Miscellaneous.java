package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="miscellaneous")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Miscellaneous {

    public Miscellaneous(String musicKit, String statTrakTool, String nameTag, String gift){

        this.musicKit = musicKit;
        this.statTrakTool = statTrakTool;
        this.nameTag = nameTag;
        this.gift = gift;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String musicKit;
    private String statTrakTool;
    private String nameTag;
    private String gift;

}
