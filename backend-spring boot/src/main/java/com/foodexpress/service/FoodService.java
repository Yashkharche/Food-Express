package com.foodexpress.service;

import java.util.List;

import com.foodexpress.Exception.FoodException;
import com.foodexpress.Exception.RestaurantException;
import com.foodexpress.model.Category;
import com.foodexpress.model.Food;
import com.foodexpress.model.Restaurant;
import com.foodexpress.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req, Category category,
			Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;

	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal, String foodCategory) throws FoodException;

	public List<Food> searchFood(String keyword);

	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
