package com.furni.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ReviewDTO;
import com.furni.service.ReviewService;

@SpringBootTest
class RevieItem {

	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		List<ReviewDTO> list = null;
		try {
			list = service.reviewitem(102);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);

	}

}
