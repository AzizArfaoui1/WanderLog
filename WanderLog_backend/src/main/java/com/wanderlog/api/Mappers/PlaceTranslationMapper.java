package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.PlaceTranslation;
import com.wanderlog.api.DTO.PlaceTranslationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlaceTranslationMapper {
    @Mapping(target = "placeId", source = "place.id")
    PlaceTranslationDto toDto(PlaceTranslation placetranslation);

    @Mapping(target = "place", ignore = true)
    PlaceTranslation toEntity(PlaceTranslationDto dto);
}

