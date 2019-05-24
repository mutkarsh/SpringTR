package com.globant.spring;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {

	public String placeorder() {

		int orderno = new Random(5).nextInt() * 2000;
		System.out.println("order placed..." + orderno);
		return "OD" + orderno;
	}

	public boolean shiporder() {

		System.out.println("order Shipped...");
		return true;
	}

}
