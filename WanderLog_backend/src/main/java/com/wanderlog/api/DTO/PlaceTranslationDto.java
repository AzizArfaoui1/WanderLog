package com.wanderlog.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaceTranslationDto {
    private Long id;
    private String locale;
    private String name;
    private String description;
    private Long placeId;
}

