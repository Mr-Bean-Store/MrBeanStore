package com.example.devBean.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devBean.model.OrderItem;

interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
