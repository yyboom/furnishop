package com.furni.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CartDTO;
import com.furni.service.CartService;

@SpringBootTest
class Cartall {

	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		List<CartDTO> list = null;
		try {
			list = service.cartall("id08");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (CartDTO c : list) {
			System.out.println(c);
		}

	}

}
