package com.absolomb.crud.dtos;

import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

@SuppressWarnings("LombokGetterMayBeUsed")
public class ProductDTO {
    @NotBlank(message = "O nome é obrigatório") // Validação
    private String name;

    private BigDecimal price;

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @SuppressWarnings("unused")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
