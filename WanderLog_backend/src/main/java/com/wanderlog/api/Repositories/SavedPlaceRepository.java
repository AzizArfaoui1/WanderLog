package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.SavedPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavedPlaceRepository extends JpaRepository<SavedPlace, Long> {
}
