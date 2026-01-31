package com.example.ecommerce_web.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartItemDTO {
    private Long ItemId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private ProductDTO product;
}
