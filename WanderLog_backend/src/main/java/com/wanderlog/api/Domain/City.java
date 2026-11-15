package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;
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

public class City {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;


    @OneToMany(mappedBy = "city")
    private List<Place> places = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
}
