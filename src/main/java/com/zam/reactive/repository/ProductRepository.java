package com.zam.reactive.repository;

import com.zam.reactive.entity.ProductEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductRepository extends ReactiveCrudRepository<ProductEntity, Integer> {
}
