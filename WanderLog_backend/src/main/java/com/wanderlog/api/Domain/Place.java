package com.wanderlog.api.Domain;

import jakarta.persistence.*;
import com.wanderlog.api.Enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Place {
    @Id
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    @Enumerated(EnumType.STRING)
    private PlaceCategory category;
    private boolean isVerified;
    @Enumerated(EnumType.STRING)
    private ModerationStatus status;


}
