package com.foodexpress.service;

import java.util.List;

import com.foodexpress.Exception.CartException;
import com.foodexpress.Exception.OrderException;
import com.foodexpress.Exception.RestaurantException;
import com.foodexpress.Exception.UserException;
import com.foodexpress.model.PaymentResponse;
import com.foodexpress.model.User;
import com.foodexpress.request.CreateOrderRequest;
import com.stripe.exception.StripeException;
import com.foodexpress.model.Order;

public interface OrderService {

	public PaymentResponse createOrder(CreateOrderRequest order, User user)
			throws UserException, RestaurantException, CartException, StripeException;

	public Order updateOrder(Long orderId, String orderStatus) throws OrderException;

	public void cancelOrder(Long orderId) throws OrderException;

	public List<Order> getUserOrders(Long userId) throws OrderException;

	public List<Order> getOrdersOfRestaurant(Long restaurantId, String orderStatus)
			throws OrderException, RestaurantException;

}
