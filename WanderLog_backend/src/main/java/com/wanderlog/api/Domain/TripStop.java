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
    private Long id;
    private int dayIndex;
    private int position;
    private int plannedMinutes;


}
