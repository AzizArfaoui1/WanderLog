package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
