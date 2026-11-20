package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.SavedPlace;
import com.wanderlog.api.DTO.SavedPlaceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SavedPlaceMapper {
    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "placeId", source = "place.id")
    SavedPlaceDto toDto(SavedPlace savedplace);

    @Mapping(target = "user", ignore = true)
    @Mapping(target = "place", ignore = true)
    SavedPlace toEntity(SavedPlaceDto dto);
}

