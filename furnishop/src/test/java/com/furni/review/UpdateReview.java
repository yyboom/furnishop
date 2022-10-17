package com.furni.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ReviewDTO;
import com.furni.service.ReviewService;

@SpringBootTest
class UpdateReview {

	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		ReviewDTO review = new ReviewDTO(708, "id02", 108, 3, "배송빠름 마감은 쏘쏘", "2022-10-16", "reviewchair6.jpg", null,
				null, null, null);
		try {
			service.modify(review);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(review);
	}

}
