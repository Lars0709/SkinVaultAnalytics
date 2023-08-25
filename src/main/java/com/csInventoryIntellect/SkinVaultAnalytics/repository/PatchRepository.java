package com.csInventoryIntellect.SkinVaultAnalytics.repository;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Patch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatchRepository extends JpaRepository<Patch, Long> {

    Optional<Patch> searchByPatchName(String patchName);

}
