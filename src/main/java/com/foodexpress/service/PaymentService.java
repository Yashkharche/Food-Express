package com.foodexpress.service;

import com.foodexpress.model.PaymentResponse;
import com.stripe.exception.StripeException;
import com.foodexpress.model.Order;

public interface PaymentService {

	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
