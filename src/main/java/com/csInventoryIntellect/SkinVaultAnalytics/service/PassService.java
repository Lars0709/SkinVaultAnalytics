package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Pass;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.PassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassService {

    @Autowired
    private PassRepository passRepository;

    public List<Pass> getAllPasses(){
        return passRepository.findAll();
    }

}
