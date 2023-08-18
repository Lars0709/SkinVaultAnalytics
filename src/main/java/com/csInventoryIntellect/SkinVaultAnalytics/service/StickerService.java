package com.csInventoryIntellect.SkinVaultAnalytics.service;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Sticker;
import com.csInventoryIntellect.SkinVaultAnalytics.repository.StickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StickerService {

    @Autowired
    private StickerRepository stickerRepository;

    // Create new Sticker
    public Sticker createSticker(Sticker sticker){
        return stickerRepository.save(sticker);
    }

    // Get all Stickers
    public List<Sticker> getAllStickers(){
        return stickerRepository.findAll();
    }

    // Get Sticker by ID
    public Optional<Sticker> getStickerById(Long id){
        return stickerRepository.findById(id);
    }

    // Delete Sticker by ID
    public void deleteStickerById(Long id){
        stickerRepository.deleteById(id);
    }

}
