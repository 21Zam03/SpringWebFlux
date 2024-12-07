package com.zam.reactive.service.impl;

import com.zam.reactive.entity.ProductEntity;
import com.zam.reactive.payload.request.ProductCreateRequest;
import com.zam.reactive.repository.ProductRepository;
import com.zam.reactive.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Flux<ProductEntity> getAllProducts() {
        return null;
    }

    @Override
    public Mono<ProductEntity> getProduct(int id) {
        return null;
    }

    @Override
    public Mono<ProductEntity> createProduct(ProductCreateRequest product) {
        return null;
    }

}
