package com.furniture.repositories;

import com.furniture.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // You can define additional query methods here if needed
}
