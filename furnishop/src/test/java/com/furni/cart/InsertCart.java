package com.furni.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CartDTO;
import com.furni.service.CartService;

@SpringBootTest
class InsertCart {

	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		try {
			service.register(new CartDTO(0, "id02", 104, 1, 3, "소파", 0, null, null, null, 0, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
