package com.furni.wishlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.WishlistDTO;
import com.furni.service.WishlistService;

@SpringBootTest
class GetWishlist {

	@Autowired
	WishlistService service;

	@Test
	void contextLoads() {
		WishlistDTO wish = null;
		try {
			wish = service.get(600);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(wish);
	}

}
