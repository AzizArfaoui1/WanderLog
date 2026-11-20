package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.Country;
import com.wanderlog.api.DTO.CountryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDto toDto(Country country);


    Country toEntity(CountryDto dto);
}

