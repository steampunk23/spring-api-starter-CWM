package com.steampunk.store.mappers;

import com.steampunk.store.dtos.RegisterUserRequest;
import com.steampunk.store.dtos.UserDto;
import com.steampunk.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
}
