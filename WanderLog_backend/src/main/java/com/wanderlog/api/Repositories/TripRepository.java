package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}
