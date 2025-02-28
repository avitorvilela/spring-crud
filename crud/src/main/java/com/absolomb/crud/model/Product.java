package com.absolomb.crud.model;

import com.absolomb.crud.dtos.ProductDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity(name="product")
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private BigDecimal price;

    public Product(ProductDTO dto) {
        super();
        this.name = dto.getName();
        this.price = dto.getPrice();
    }

    // Construtor padrão (obrigatório para o Hibernate)
    @SuppressWarnings("unused")
    public Product() {}
}
