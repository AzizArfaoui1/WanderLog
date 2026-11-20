package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.Trip;
import com.wanderlog.api.DTO.TripDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TripMapper {
    @Mapping(target = "userId", source = "user.id")
    TripDto toDto(Trip trip);

    @Mapping(target = "user", ignore = true)
    Trip toEntity(TripDto dto);
}

