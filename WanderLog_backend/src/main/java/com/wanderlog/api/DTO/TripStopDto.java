package com.wanderlog.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripStopDto {
    private Long id;
    private int dayIndex;
    private int position;
    private int plannedMinutes;
    private Long placeId;
    private Long tripId;
}

