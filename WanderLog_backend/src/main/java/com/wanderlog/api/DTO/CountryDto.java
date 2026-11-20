package com.wanderlog.api.DTO;

import com.wanderlog.api.Enums.Continent;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {
    private Long id;
    private String iso2;
    private String name;
    private Continent continent;
}

