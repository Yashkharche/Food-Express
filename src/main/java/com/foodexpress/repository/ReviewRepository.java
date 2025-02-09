package com.foodexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
