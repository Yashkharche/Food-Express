package com.foodexpress.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodexpress.model.Food;
import com.foodexpress.model.OrderItem;
import com.foodexpress.repository.OrderItemRepository;

@Service
public class OrderItemServiceImplementation implements OrderItemService {
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public OrderItem createOrderIem(OrderItem orderItem) {

		OrderItem newOrderItem = new OrderItem();
		// newOrderItem.setMenuItem(orderItem.getMenuItem());
		// newOrderItem.setOrder(orderItem.getOrder());
		newOrderItem.setQuantity(orderItem.getQuantity());
		return orderItemRepository.save(newOrderItem);
	}

}
