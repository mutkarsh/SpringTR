package com.globant.spring;

import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentService {

	public void pay() {
		
		System.out.println("Payment Success...");
	}
}

