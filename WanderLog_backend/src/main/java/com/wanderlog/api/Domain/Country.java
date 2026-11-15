package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.Continent;

@Entity
public class Country {
    @Id
    private Long id;
    private String iso2;
    private String name;
    @Enumerated(EnumType.STRING)
    private Continent continent;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
