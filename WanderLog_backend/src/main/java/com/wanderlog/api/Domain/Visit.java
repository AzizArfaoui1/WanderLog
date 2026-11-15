package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;
import java.time.LocalDate;

@Entity
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
