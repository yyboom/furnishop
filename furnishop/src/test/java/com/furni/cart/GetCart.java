package com.furni.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CartDTO;
import com.furni.service.CartService;

@SpringBootTest
class GetCart {

	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		CartDTO cart = null;
		try {
			cart = service.get(503);
			System.out.println(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
