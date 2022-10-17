package com.furni.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.ReviewService;

@SpringBootTest
class DeleteReview {

	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		try {
			service.remove("id09");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}