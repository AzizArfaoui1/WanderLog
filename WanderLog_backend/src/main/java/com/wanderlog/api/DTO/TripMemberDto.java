package com.wanderlog.api.DTO;

import com.wanderlog.api.Enums.TripRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripMemberDto {
    private Long id;
    private TripRole role;
    private Long tripId;
    private Long userId;
}

