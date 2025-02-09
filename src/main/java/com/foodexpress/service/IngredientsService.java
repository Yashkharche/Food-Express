package com.foodexpress.service;

import java.util.List;

import com.foodexpress.Exception.FoodException;
import com.foodexpress.Exception.RestaurantException;
import com.foodexpress.model.Food;
import com.foodexpress.model.IngredientCategory;
import com.foodexpress.model.IngredientsItem;
import com.foodexpress.repository.IngredientsCategoryRepository;

public interface IngredientsService {

	public IngredientCategory createIngredientsCategory(
			String name, Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;

	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	public IngredientsItem createIngredientsItem(Long restaurantId,
			String ingredientName, Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;

}
