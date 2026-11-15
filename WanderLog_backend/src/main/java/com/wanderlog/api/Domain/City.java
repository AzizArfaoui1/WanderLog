package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;

@Entity
public class City {
    @Id
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
