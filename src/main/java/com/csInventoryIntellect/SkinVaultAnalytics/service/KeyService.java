package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeyService {

    @Autowired
    private KeyRepository keyRepository;

    public void removeDoubledKeys(){

        System.out.println("dreck");

    }

}
