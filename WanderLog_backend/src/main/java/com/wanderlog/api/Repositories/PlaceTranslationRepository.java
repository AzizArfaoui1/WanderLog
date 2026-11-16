package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.PlaceTranslation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceTranslationRepository extends JpaRepository<PlaceTranslation, Long> {
}
