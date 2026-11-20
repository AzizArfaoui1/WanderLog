package com.wanderlog.api.Mappers;

import com.wanderlog.api.Domain.User;
import com.wanderlog.api.DTO.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto userDto);
}
