package com.steampunk.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductRequest {
    public String name;
    public BigDecimal price;
    public String description;
}
