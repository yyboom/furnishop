package com.furni.wishlist;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.WishlistDTO;
import com.furni.service.WishlistService;

@SpringBootTest
class GetWishAll {

	@Autowired
	WishlistService service;

	@Test
	void contextLoads() {
		List<WishlistDTO> list = null;
		try {
			list = service.wishall("id01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (WishlistDTO w : list) {
			System.out.println(w);
		}
	}

}
