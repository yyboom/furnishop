package com.furni.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ReviewDTO;
import com.furni.service.ReviewService;

@SpringBootTest
class GetReview {

	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		List<ReviewDTO> list = null;
		try {
			list = service.selectall("id02");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ReviewDTO re : list) {
			System.out.println(re);
		}
	}

}
