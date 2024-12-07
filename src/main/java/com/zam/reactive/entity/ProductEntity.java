package com.zam.reactive.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class ProductEntity {

    @Id
    private Integer id;
    private String product_name;
    private String description;
    private Double price;

}
