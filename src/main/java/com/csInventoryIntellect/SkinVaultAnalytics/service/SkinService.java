package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Skin;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.SkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkinService {
    @Autowired
    private SkinRepository skinRepository;

    // create new skin
    public Skin createSkin(Skin skin){
        return skinRepository.save(skin);
    }

    // Get all skins
    public List<Skin> getAllSkins(){
        return skinRepository.findAll();
    }

    //get skin by id
    public Optional<Skin> getSkinById(Long id){
        return skinRepository.findById(id);
    }

    //delete skin
    public void deleteSkinById(Long id){
        skinRepository.deleteById(id);
    }
}
