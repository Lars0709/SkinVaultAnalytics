package com.csInventoryIntellect.SkinVaultAnalytics.repository;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Patch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatchRepository extends JpaRepository<Patch, Long> {
}
