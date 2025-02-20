package com.foodexpress.service;

import java.util.List;

import com.foodexpress.Exception.RestaurantException;
import com.foodexpress.dto.RestaurantDto;
import com.foodexpress.model.Restaurant;
import com.foodexpress.model.User;
import com.foodexpress.request.CreateRestaurantRequest;

public interface RestaurantService {

	public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

	public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant)
			throws RestaurantException;

	public void deleteRestaurant(Long restaurantId) throws RestaurantException;

	public List<Restaurant> getAllRestaurant();

	public List<Restaurant> searchRestaurant(String keyword);

	public Restaurant findRestaurantById(Long id) throws RestaurantException;

	public Restaurant getRestaurantsByUserId(Long userId) throws RestaurantException;

	public RestaurantDto addToFavorites(Long restaurantId, User user) throws RestaurantException;

	public Restaurant updateRestaurantStatus(Long id) throws RestaurantException;
}
