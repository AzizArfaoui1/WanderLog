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

public class Place {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    @Enumerated(EnumType.STRING)
    private PlaceCategory category;
    private boolean isVerified;
    @Enumerated(EnumType.STRING)
    private ModerationStatus status;

    @OneToMany(mappedBy = "place")
    private List<Visit> visits = new ArrayList<>();

    @OneToMany(mappedBy = "place")
    private List<TripStop> tripStops = new ArrayList<>();

    @OneToMany(mappedBy = "place")
    private List<SavedPlace> savedPlaces = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    @OneToMany(mappedBy = "place" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<PlaceTranslation> placeTranslations = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;

}
