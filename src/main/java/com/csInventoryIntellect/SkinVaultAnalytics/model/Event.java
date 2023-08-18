package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {


    public Event(Date startDate, @Nullable Date endDate, String type, @Nullable String location,
                 @Nullable String majorWinner, @Nullable String additionalInformation, @Nullable Pass pass) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;     // major, operation, stickersale???
        this.location = location;
        this.majorWinner = majorWinner;
        this.additionalInformation = additionalInformation;
        this.pass = pass;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate;
    @Nullable
    private Date endDate;
    private String type;
    @Nullable
    private String location;
    @Nullable
    private String majorWinner;
    @Nullable
    private String additionalInformation;

    @Nullable
    @OneToOne
    @JoinColumn(name = "pass_id", nullable = false)
    private Pass pass;

}
