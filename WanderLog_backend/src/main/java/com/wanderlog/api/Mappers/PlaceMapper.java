package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.Place;
import com.wanderlog.api.DTO.PlaceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlaceMapper {
    @Mapping(target = "cityId", source = "city.id")
    @Mapping(target = "countryId", source = "country.id")
    PlaceDto toDto(Place place);

    @Mapping(target = "city", ignore = true)
    @Mapping(target = "country", ignore = true)
    Place toEntity(PlaceDto dto);
}

