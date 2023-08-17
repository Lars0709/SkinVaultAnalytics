package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "passes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pass {

    public Pass(String passName, Event event) {

        this.passName = passName;
        this.event = event;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passName;


    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
