package com.wanderlog.api.Domain;

import jakarta.persistence.*;

@Entity
public class Visit {
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
