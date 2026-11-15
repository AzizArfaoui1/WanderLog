package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TripStop {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private int dayIndex;
    private int position;
    private int plannedMinutes;


    @ManyToOne(fetch = FetchType.LAZY)
    private Place place;

    @ManyToOne(fetch = FetchType.LAZY)
    private Trip trip;
}
