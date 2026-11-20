package com.wanderlog.api.DTO;

import com.wanderlog.api.Enums.TravelStyle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private boolean isPrivate;
    private Set<TravelStyle> travelStyles;
}
