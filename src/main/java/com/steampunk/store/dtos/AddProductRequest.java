package com.steampunk.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private String name;
    private BigDecimal price;
    private String description;
    private Byte categoryId;
}
