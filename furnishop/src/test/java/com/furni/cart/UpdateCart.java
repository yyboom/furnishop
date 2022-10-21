package com.furni.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CartDTO;
import com.furni.service.CartService;

@SpringBootTest
class UpdateCart {

	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(0, "id02", 109, 2, 4,"수납장", 859000, null, null, null, 0, 0);
		try {
			service.modify(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
