package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.Visit;
import com.wanderlog.api.DTO.VisitDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VisitMapper {
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "tripId", source = "trip.id")
    @Mapping(target = "placeId", source = "place.id")
    VisitDto toDto(Visit visit);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "trip", ignore = true)
    @Mapping(target = "place", ignore = true)
    Visit toEntity(VisitDto dto);
}

