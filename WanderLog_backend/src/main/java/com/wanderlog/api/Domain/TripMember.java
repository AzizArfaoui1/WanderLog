package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.TripRole;

@Entity
public class TripMember {
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private TripRole role;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
