package com.wanderlog.api.Repositories;

import com.wanderlog.api.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
