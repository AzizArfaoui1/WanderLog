package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.VisitMedia;
import com.wanderlog.api.DTO.VisitMediaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VisitMediaMapper {
    @Mapping(target = "visitId", source = "visit.id")
    VisitMediaDto toDto(VisitMedia visitmedia);

    @Mapping(target = "visit", ignore = true)
    VisitMedia toEntity(VisitMediaDto dto);
}

