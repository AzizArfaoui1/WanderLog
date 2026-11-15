package com.wanderlog.api.Domain;

import jakarta.persistence.*;

@Entity
public class SavedPlace {
    @Id
    private Long id;
    private String note;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
