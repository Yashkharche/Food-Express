package com.foodexpress.request;

import com.foodexpress.model.Address;

import lombok.Data;

@Data
public class CreateOrderRequest {

	private Long restaurantId;

	private Address deliveryAddress;

}
