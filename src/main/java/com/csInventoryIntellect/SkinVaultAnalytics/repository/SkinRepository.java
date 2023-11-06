package com.csInventoryIntellect.SkinVaultAnalytics.repository;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Skin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkinRepository extends JpaRepository<Skin, Long> {

    List<Skin> searchByGunNameContainingIgnoreCase(String gunName);


}