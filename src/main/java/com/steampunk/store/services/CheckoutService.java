package com.steampunk.store.services;

import com.steampunk.store.dtos.CheckoutRequest;
import com.steampunk.store.dtos.CheckoutResponse;
import com.steampunk.store.dtos.ErrorDto;
import com.steampunk.store.entities.Order;
import com.steampunk.store.exceptions.CartEmptyException;
import com.steampunk.store.exceptions.CartNotFoundException;
import com.steampunk.store.repositories.CartRepository;
import com.steampunk.store.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CheckoutService {
    private final CartRepository cartRepository;
    private final OrderRepository orderRepository;
    private final AuthService authService;
    private final CartService cartService;

    public CheckoutResponse checkout(CheckoutRequest request) {
        var cart = cartRepository.getCartWithItems(request.getCartId()).orElse(null);
        if (cart == null) {
            throw new CartNotFoundException();
        }

        if (cart.isEmpty()) {
            throw new CartEmptyException();
        }

        var order = Order.fromCart(cart, authService.getCurrentUser());

        orderRepository.save(order);

        cartService.clearCart(cart.getId());

        return  new  CheckoutResponse(order.getId());
    }
}
