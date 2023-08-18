package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {


    public Event(String startDate, @Nullable String endDate, String type, @Nullable String location,
                 @Nullable String majorWinner, @Nullable String additionalInformation, @Nullable List<Pass> passes) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;     // major, operation, stickersale???
        this.location = location;
        this.majorWinner = majorWinner;
        this.additionalInformation = additionalInformation;
        this.passes = passes;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startDate;
    @Nullable
    private String endDate;
    private String type;
    @Nullable
    private String location;
    @Nullable
    private String majorWinner;
    @Nullable
    private String additionalInformation;

    @Nullable
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pass_id")
    private List<Pass> passes;

}
