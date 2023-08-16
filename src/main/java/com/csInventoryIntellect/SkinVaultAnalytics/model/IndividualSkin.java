package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "individualSkins")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualSkin {



    public IndividualSkin(double wearFloat, int patternId, boolean statTrak, boolean souvenir,String eventSouvenir,
                          boolean stickerSlotOneApplied, boolean stickerSlotTwoApplied, boolean stickerSlotThreeApplied,
                          boolean stickerSlotFourApplied, boolean stickerSlotFiveApplied, boolean unboxed, boolean crafted,
                          boolean levelUpReward, String speciality){

        // this.skin = skin;
        this.wearFloat = wearFloat;
        this.patternId = patternId;
        this.statTrak = statTrak;
        this.souvenir = souvenir;
        this.eventSouvenir = eventSouvenir;
        this.stickerSlotOneApplied = stickerSlotOneApplied;
        this.stickerSlotTwoApplied = stickerSlotTwoApplied;
        this.stickerSlotThreeApplied = stickerSlotThreeApplied;
        this.stickerSlotFourApplied = stickerSlotFourApplied;
        this.stickerSlotFiveApplied = stickerSlotFiveApplied;

        /*
        this.stickerSlotOne = stickerSlotOne;
        this.stickerSlotTwo = stickerSlotTwo;
        this.stickerSlotThree = stickerSlotThree;
        this.stickerSlotFour = stickerSlotFour;
        this.stickerSlotFive = stickerSlotFive;
         */

        this.unboxed = unboxed;
        this.crafted = crafted;
        this.levelUpReward = levelUpReward;
        this.speciality = speciality;
    }

    // sticker verlinken mit sticker db über id
    // one to many

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Skin skin;


    private double wearFloat;

    //private Collection collection;

    private int patternId;
    private boolean statTrak;
    private boolean souvenir;
    private String eventSouvenir;
    private boolean stickerSlotOneApplied;
    private boolean stickerSlotTwoApplied;
    private boolean stickerSlotThreeApplied;
    private boolean stickerSlotFourApplied;
    private boolean stickerSlotFiveApplied;

    /*
    private Sticker stickerSlotOne;
    private Sticker stickerSlotTwo;
    private Sticker stickerSlotThree;
    private Sticker stickerSlotFour;
    private Sticker stickerSlotFive;
     */

    private boolean unboxed;
    private boolean crafted;
    private boolean levelUpReward;
    private String speciality;

}

