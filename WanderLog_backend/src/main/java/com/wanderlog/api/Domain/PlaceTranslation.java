package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class PlaceTranslation {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String locale;
    private String name;
    private String description;


    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;
}
