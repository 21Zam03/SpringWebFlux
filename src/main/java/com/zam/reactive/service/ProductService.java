package com.zam.reactive.service;

import com.zam.reactive.entity.ProductEntity;
import com.zam.reactive.payload.request.ProductCreateRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {

    public Flux<ProductEntity> getAllProducts();
    public Mono<ProductEntity> getProduct(int id);
    public Mono<ProductEntity> createProduct(ProductCreateRequest product);

}
