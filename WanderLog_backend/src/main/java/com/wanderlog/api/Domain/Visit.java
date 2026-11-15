package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Visit {
    @Id
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


}
