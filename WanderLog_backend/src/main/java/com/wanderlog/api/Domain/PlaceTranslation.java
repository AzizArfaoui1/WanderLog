package com.wanderlog.api.Domain;

import jakarta.persistence.*;

@Entity
public class PlaceTranslation {
    @Id
    private Long id;
    private String locale;
    private String name;
    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
