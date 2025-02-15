package com.foodexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    // CartItem findByFoodIsContaining

}
