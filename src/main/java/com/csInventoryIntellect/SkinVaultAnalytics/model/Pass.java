package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="passes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pass {

    public Pass(String passName, Event event){

        this.passName = passName;
        this.event = event;
    }
}
