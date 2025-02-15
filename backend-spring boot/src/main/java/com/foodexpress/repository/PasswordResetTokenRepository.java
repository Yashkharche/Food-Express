package com.foodexpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodexpress.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
