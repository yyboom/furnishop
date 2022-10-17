package com.furni.wishlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.WishlistDTO;
import com.furni.service.WishlistService;

@SpringBootTest
class InsertWishlist {

	@Autowired
	WishlistService service;

	@Test
	void contextLoads() {

		try {
			service.register(new WishlistDTO(0, "id09", 109, "수납장", "브라운", "1500*750*737"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
