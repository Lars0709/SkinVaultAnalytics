package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.util.Date;

@Entity(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {


    public Event(Date startDate, Date endDate, String type, String location, String majorWinner,
                 String additionalInformation) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.location = location;
        this.majorWinner = majorWinner;
        this.additionalInformation = additionalInformation;

    }

    // collections in addition????????

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

}
