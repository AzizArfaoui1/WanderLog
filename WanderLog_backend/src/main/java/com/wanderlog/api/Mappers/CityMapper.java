package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.City;
import com.wanderlog.api.DTO.CityDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CityMapper {
    @Mapping(target = "countryId", source = "country.id")
    CityDto toDto(City city);

    @Mapping(target = "country", ignore = true)
    City toEntity(CityDto dto);
}

