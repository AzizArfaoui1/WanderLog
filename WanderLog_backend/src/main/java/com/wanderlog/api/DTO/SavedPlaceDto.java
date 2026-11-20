package com.wanderlog.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SavedPlaceDto {
    private Long id;
    private String note;
    private Long userId;
    private Long placeId;
}

