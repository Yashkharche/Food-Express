package com.foodexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
