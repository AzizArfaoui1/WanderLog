package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.Visibility;
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

public class Trip {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Enumerated(EnumType.STRING)
    private Visibility visibility;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "trip")
    private List<Visit> visits = new ArrayList<>();

    @OneToMany( mappedBy = "trip" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<TripMember> tripMemberships = new ArrayList<>();

    @OneToMany( mappedBy = "trip" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<TripStop> tripStops = new ArrayList<>();



}
