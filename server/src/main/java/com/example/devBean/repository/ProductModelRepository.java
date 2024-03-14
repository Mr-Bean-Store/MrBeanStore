package com.example.devBean.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devBean.model.ProductModel;

public interface ProductModelRepository extends JpaRepository<ProductModel, Long> {
    
}