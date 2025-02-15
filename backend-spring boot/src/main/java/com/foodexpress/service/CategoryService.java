package com.foodexpress.service;

import java.util.List;

import com.foodexpress.Exception.RestaurantException;
import com.foodexpress.model.Category;

public interface CategoryService {

	public Category createCategory(String name, Long userId) throws RestaurantException;

	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;

	public Category findCategoryById(Long id) throws RestaurantException;

}
