package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
