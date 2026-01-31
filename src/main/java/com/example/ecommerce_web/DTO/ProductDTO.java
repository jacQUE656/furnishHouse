package com.example.ecommerce_web.DTO;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDTO {
    private String name;
    private String brand;
    private String description;
    private BigDecimal inventory;
    private List<ImageDTO> imageDto;
}
