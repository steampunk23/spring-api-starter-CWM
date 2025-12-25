package com.steampunk.store.controllers;

import com.steampunk.store.dtos.CheckoutRequest;
import com.steampunk.store.dtos.CheckoutResponse;
import com.steampunk.store.dtos.ErrorDto;
import com.steampunk.store.exceptions.CartEmptyException;
import com.steampunk.store.exceptions.CartNotFoundException;
import com.steampunk.store.services.CheckoutService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/checkout")
public class CheckoutController {
    private final CheckoutService checkoutService;

    @PostMapping
    public CheckoutResponse checkout(@Valid @RequestBody CheckoutRequest request) {
        return checkoutService.checkout(request);
    }

    @ExceptionHandler({CartNotFoundException.class, CartEmptyException.class})
    public ResponseEntity<ErrorDto> handleException(Exception ex) {
        return ResponseEntity.badRequest().body(new ErrorDto(ex.getMessage()));
    }
}
