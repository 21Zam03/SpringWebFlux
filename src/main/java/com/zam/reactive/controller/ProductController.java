package com.zam.reactive.controller;

import com.zam.reactive.entity.ProductEntity;
import com.zam.reactive.payload.request.ProductCreateRequest;
import com.zam.reactive.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ProductController.API_PATH)
public class ProductController {

    public static final String API_PATH = "/api/product";

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Flux<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Mono<ProductEntity> saveProduct(@RequestBody ProductCreateRequest product) {
        return productService.createProduct(product);
    }

}
