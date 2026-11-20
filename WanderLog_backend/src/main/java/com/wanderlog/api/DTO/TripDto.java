package com.wanderlog.api.DTO;

import com.wanderlog.api.Enums.Visibility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripDto {
    private Long id;
    private String title;
    private Visibility visibility;
    private Long userId;
}

