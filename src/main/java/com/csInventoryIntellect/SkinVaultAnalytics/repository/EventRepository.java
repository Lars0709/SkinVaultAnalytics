package com.csInventoryIntellect.SkinVaultAnalytics.repository;

import com.csInventoryIntellect.SkinVaultAnalytics.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
