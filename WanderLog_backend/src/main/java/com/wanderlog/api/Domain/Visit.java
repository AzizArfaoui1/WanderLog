package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Visit {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate visitedOn;
    private int timeSpentMinutes;
    @Enumerated(EnumType.STRING)
    private TimeSource timeSource;
    private int rating;
    @Enumerated(EnumType.STRING)
    private TravelStyle travelStyle;
    @Enumerated(EnumType.STRING)
    private Verification verification;
    @Enumerated(EnumType.STRING)
    private Visibility visibility;
    @Enumerated(EnumType.STRING)
    private ModerationStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "visit" , cascade= CascadeType.ALL , orphanRemoval = true)
    private List<VisitMedia> visitmedias = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Trip trip;

    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;



}
