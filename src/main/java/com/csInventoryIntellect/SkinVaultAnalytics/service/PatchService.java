package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Patch;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.PatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatchService {

    @Autowired
    private PatchRepository patchRepository;

    public List<Patch> getAllPatches(){
        return patchRepository.findAll();
    }

}
