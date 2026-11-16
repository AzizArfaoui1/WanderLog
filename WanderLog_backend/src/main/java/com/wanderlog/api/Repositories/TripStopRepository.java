package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.TripStop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripStopRepository extends JpaRepository<TripStop, Long> {
}
