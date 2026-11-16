package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
