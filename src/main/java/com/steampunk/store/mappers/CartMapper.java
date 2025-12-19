package com.steampunk.store.mappers;

import com.steampunk.store.dtos.CartDto;
import com.steampunk.store.dtos.CartItemDto;
import com.steampunk.store.entities.Cart;
import com.steampunk.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
//    @Mapping(target = "items", source = "items")
//    No need of mapping. because target name  and source name is same
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
