package com.wanderlog.api.DTO;

import com.wanderlog.api.Enums.ModerationStatus;
import com.wanderlog.api.Enums.PlaceCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaceDto {
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
    private PlaceCategory category;
    private boolean isVerified;
    private ModerationStatus status;
    private Long cityId;
    private Long countryId;
}

