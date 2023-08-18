package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Key;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.KeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeyService {

    @Autowired
    private KeyRepository keyRepository;

    public List<Key> getAllKeys(){
        return keyRepository.findAll();
    }

}
