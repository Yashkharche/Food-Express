package com.foodexpress.request;

import java.time.LocalDateTime;
import java.util.List;

import com.foodexpress.model.ContactInformation;
import com.foodexpress.model.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRestaurantRequest {

	private Long id;
	private String name;
	private String description;
	private String cuisineType;
	private Address address;
	private ContactInformation contactInformation;
	private String openingHours;
	private List<String> images;
	private LocalDateTime registrationDate;
}
