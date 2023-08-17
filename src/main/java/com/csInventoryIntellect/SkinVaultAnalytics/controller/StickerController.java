package com.csInventoryIntellect.SkinVaultAnalytics.controller;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import com.csInventoryIntellect.SkinVaultAnalytics.model.Sticker;
import com.csInventoryIntellect.SkinVaultAnalytics.service.StickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sticker")
public class StickerController {

    @Autowired
    private StickerService stickerService;

    // Create new Sticker
    @PostMapping
    public Sticker createSticker(@RequestBody Sticker sticker){
        return stickerService.createSticker(sticker);
    }

    // Get all Stickers
    @GetMapping
    public List<Sticker> getAllStickers(){
        return stickerService.getAllStickers();
    }

    // Get Sticker by id
    @GetMapping("/{id}")
    public Optional<Sticker> getStickerById(@PathVariable Long id){
        return stickerService.getStickerById(id);
    }

    // Delete sticker by id
    @DeleteMapping("/{id}")
    public void deleteStickerById(@PathVariable Long id){
        stickerService.deleteStickerById(id);
    }
}
