package com.furni.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.CartService;

@SpringBootTest
class GetTotal_Sum {

	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		try {
			int i = service.total_sum("id03");
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
