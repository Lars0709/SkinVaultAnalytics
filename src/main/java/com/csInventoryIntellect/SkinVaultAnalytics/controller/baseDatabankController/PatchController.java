package com.csInventoryIntellect.SkinVaultAnalytics.controller.baseDatabankController;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Patch;
import com.csInventoryIntellect.SkinVaultAnalytics.service.PatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patches")
public class PatchController {

    @Autowired
    private PatchService patchService;

    @GetMapping
    public List<Patch> getAllPatches(){
        return patchService.getAllPatches();
    }

}
