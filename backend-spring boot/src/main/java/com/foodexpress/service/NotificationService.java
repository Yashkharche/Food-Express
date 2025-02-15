package com.foodexpress.service;

import java.util.List;

import com.foodexpress.model.Notification;
import com.foodexpress.model.Restaurant;
import com.foodexpress.model.User;
import com.foodexpress.model.Order;

public interface NotificationService {

	public Notification sendOrderStatusNotification(Order order);

	public void sendRestaurantNotification(Restaurant restaurant, String message);

	public void sendPromotionalNotification(User user, String message);

	public List<Notification> findUsersNotification(Long userId);

}
