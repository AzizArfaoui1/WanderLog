package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.TravelStyle;
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

public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private boolean isPrivate;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private java.util.Set<TravelStyle> travelStyles = new java.util.HashSet<>();

    @OneToMany(mappedBy = "user", cascade= CascadeType.ALL , orphanRemoval = true)
    private List<Visit> visits= new ArrayList<>();

    @OneToMany(mappedBy= "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Trip> trips = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SavedPlace> savedPlaces = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<TripMember> tripMemberships;
}
