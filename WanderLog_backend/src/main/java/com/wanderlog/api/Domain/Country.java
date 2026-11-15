package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.Continent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Country {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String iso2;
    private String name;
    @Enumerated(EnumType.STRING)
    private Continent continent;

    @OneToMany(mappedBy = "country")
    private List<Place> places = new ArrayList<>();

    @OneToMany( mappedBy = "country")
    private List<City> cities = new ArrayList<>();
}
