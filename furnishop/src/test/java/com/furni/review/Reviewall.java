package com.furni.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ReviewDTO;
import com.furni.service.ReviewService;

@SpringBootTest
class Reviewall {

	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		List<ReviewDTO> list = null;
		try {
			list = service.reviewall("id08");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (ReviewDTO c : list) {
			System.out.println(c);
		}

	}

}
