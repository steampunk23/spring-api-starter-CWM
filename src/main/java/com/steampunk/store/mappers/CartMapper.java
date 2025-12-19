package com.steampunk.store.mappers;

import com.steampunk.store.dtos.CartDto;
import com.steampunk.store.dtos.CartItemDto;
import com.steampunk.store.entities.Cart;
import com.steampunk.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
