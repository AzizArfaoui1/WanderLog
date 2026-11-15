package com.wanderlog.api.Domain;

import jakarta.persistence.*;

@Entity
public class TripStop {
    @Id
    private Long id;
    private int dayIndex;
    private int position;
    private int plannedMinutes;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
