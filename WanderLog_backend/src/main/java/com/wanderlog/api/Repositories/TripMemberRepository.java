package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.TripMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripMemberRepository extends JpaRepository<TripMember, Long> {
}
