package com.steampunk.store.mappers;

import com.steampunk.store.dtos.OrderDto;
import com.steampunk.store.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
