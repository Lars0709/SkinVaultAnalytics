package com.csInventoryIntellect.SkinVaultAnalytics.repository;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CollectionRepository extends JpaRepository<Collection, Long> {

    List<Collection> searchByCollectionTypeContainingIgnoreCase(String collectionType);

}
