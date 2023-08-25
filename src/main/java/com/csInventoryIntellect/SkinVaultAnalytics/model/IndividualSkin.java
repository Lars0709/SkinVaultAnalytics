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

    public IndividualSkin(Skin skin, String nameTag, double wearFloat, int patternId, boolean statTrak, boolean souvenir,
                          String eventSouvenir, boolean stickerSlotOneApplied, boolean stickerSlotTwoApplied,
                          boolean stickerSlotThreeApplied, boolean stickerSlotFourApplied, boolean stickerSlotFiveApplied,
                          Sticker stickerSlotOne, Sticker stickerSlotTwo, Sticker stickerSlotThree, Sticker stickerSlotFour,
                          Sticker stickerSlotFive,int stickerSlotOneWear, int stickerSlotTwoWear, int stickerSlotThreeWear,
                          int stickerSlotFourWear, int stickerSlotFiveWear, boolean unboxed, boolean crafted, boolean levelUpReward,
                          String speciality) {

        this.skin = skin;
        this.nameTag = nameTag;
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
        this.stickerSlotOne = stickerSlotOne;
        this.stickerSlotTwo = stickerSlotTwo;
        this.stickerSlotThree = stickerSlotThree;
        this.stickerSlotFour = stickerSlotFour;
        this.stickerSlotFive = stickerSlotFive;
        this.stickerSlotOneWear = stickerSlotOneWear;
        this.stickerSlotTwoWear = stickerSlotTwoWear;
        this.stickerSlotThreeWear = stickerSlotThreeWear;
        this.stickerSlotFourWear = stickerSlotFourWear;
        this.stickerSlotFiveWear = stickerSlotFiveWear;
        this.unboxed = unboxed;
        this.crafted = crafted;
        this.levelUpReward = levelUpReward;
        this.speciality = speciality;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "skin_id")
    private Skin skin;

    private String nameTag;
    private double wearFloat;
    private int patternId;
    private boolean statTrak;
    private boolean souvenir;
    private String eventSouvenir;
    private boolean stickerSlotOneApplied;
    private boolean stickerSlotTwoApplied;
    private boolean stickerSlotThreeApplied;
    private boolean stickerSlotFourApplied;
    private boolean stickerSlotFiveApplied;
    private int stickerSlotOneWear;
    private int stickerSlotTwoWear;
    private int stickerSlotThreeWear;
    private int stickerSlotFourWear;
    private int stickerSlotFiveWear;
    @ManyToOne
    @JoinColumn(name = "sticker_slot_one_id")
    private Sticker stickerSlotOne;
    @ManyToOne
    @JoinColumn(name = "sticker_slot_two_id")
    private Sticker stickerSlotTwo;
    @ManyToOne
    @JoinColumn(name = "sticker_slot_three_id")
    private Sticker stickerSlotThree;
    @ManyToOne
    @JoinColumn(name = "sticker_slot_four_id")
    private Sticker stickerSlotFour;
    @ManyToOne
    @JoinColumn(name = "sticker_slot_five_id")
    private Sticker stickerSlotFive;
    private boolean unboxed;
    private boolean crafted;
    private boolean levelUpReward;
    private String speciality;

}

