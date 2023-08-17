package com.csInventoryIntellect.SkinVaultAnalytics.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="individualAgents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndividualAgent {

    public IndividualAgent(Agent agent, boolean patchSlotOneApplied, boolean patchSlotTwoApplied,
                           boolean patchSlotThreeApplied, Patch patchSlotOne, Patch patchSlotTwo, Patch patchSlotThree){

        this.agent = agent;
        this.patchSlotOneApplied = patchSlotOneApplied;
        this.patchSlotTwoApplied = patchSlotTwoApplied;
        this.patchSlotThreeApplied = patchSlotThreeApplied;
        this.patchSlotOne = patchSlotOne;
        this.patchSlotTwo = patchSlotTwo;
        this.patchSlotThree = patchSlotThree;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;
    private boolean patchSlotOneApplied;
    private boolean patchSlotTwoApplied;
    private boolean patchSlotThreeApplied;
    @ManyToOne
    @JoinColumn(name = "patch_slot_one_id")
    private Patch patchSlotOne;
    @ManyToOne
    @JoinColumn(name = "patch_slot_two_id")
    private Patch patchSlotTwo;
    @ManyToOne
    @JoinColumn(name = "patch_slot_three_id")
    private Patch patchSlotThree;

}
