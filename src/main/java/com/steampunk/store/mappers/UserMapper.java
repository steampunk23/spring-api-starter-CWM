package com.steampunk.store.mappers;

import com.steampunk.store.dtos.RegisterUserRequest;
import com.steampunk.store.dtos.UpdateUserRequest;
import com.steampunk.store.dtos.UserDto;
import com.steampunk.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
