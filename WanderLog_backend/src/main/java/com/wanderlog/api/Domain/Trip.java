package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.Visibility;

@Entity
public class Trip {
    @Id
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Visibility visibility;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
