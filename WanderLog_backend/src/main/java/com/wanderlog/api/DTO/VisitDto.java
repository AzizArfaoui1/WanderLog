package com.wanderlog.api.DTO;

import com.wanderlog.api.Enums.ModerationStatus;
import com.wanderlog.api.Enums.TimeSource;
import com.wanderlog.api.Enums.TravelStyle;
import com.wanderlog.api.Enums.Verification;
import com.wanderlog.api.Enums.Visibility;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VisitDto {
    private Long id;
    private LocalDate visitedOn;
    private int timeSpentMinutes;
    private TimeSource timeSource;
    private int rating;
    private TravelStyle travelStyle;
    private Verification verification;
    private Visibility visibility;
    private ModerationStatus status;
    private Long userId;
    private Long tripId;
    private Long placeId;
}

