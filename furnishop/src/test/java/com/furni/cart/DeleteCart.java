package com.furni.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.CartService;

@SpringBootTest
class DeleteCart {

	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		try {
			service.remove(502);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}