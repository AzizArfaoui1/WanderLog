package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;

@Entity
public class Place {
    @Id
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    @Enumerated(EnumType.STRING)
    private PlaceCategory category;
    private boolean isVerified;
    @Enumerated(EnumType.STRING)
    private ModerationStatus status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
