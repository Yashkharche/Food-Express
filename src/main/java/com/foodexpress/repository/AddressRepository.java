package com.foodexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
