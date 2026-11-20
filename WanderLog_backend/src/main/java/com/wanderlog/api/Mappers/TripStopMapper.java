package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.TripStop;
import com.wanderlog.api.DTO.TripStopDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TripStopMapper {
    @Mapping(target = "placeId", source = "place.id")
    @Mapping(target = "tripId", source = "trip.id")
    TripStopDto toDto(TripStop tripstop);

    @Mapping(target = "place", ignore = true)
    @Mapping(target = "trip", ignore = true)
    TripStop toEntity(TripStopDto dto);
}

