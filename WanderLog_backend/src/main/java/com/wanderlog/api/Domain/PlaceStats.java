package com.wanderlog.api.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PlaceStats {
    @Id
    private Long id;
    private int visitCount;
    private float medianMinutes;
    private float bayesRating;


}
