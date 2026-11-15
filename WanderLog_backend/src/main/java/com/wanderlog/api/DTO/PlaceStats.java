package com.wanderlog.api.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class PlaceStats {
    private int visitCount;
    private float medianMinutes;
    private float bayesRating;

}