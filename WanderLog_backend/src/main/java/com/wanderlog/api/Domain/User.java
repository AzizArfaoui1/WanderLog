package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.TravelStyle;


@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private boolean isPrivate;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private java.util.Set<TravelStyle> travelStyles = new java.util.HashSet<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
