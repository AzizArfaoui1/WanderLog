package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.TripMember;
import com.wanderlog.api.DTO.TripMemberDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TripMemberMapper {
    @Mapping(target = "tripId", source = "trip.id")
    @Mapping(target = "userId", source = "user.id")
    TripMemberDto toDto(TripMember tripmember);

    @Mapping(target = "trip", ignore = true)
    @Mapping(target = "user", ignore = true)
    TripMember toEntity(TripMemberDto dto);
}

