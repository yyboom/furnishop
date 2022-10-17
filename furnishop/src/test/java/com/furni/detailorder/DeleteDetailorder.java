package com.furni.detailorder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.DetailorderService;

@SpringBootTest
class DeleteDetailorder {

	@Autowired
	DetailorderService service;

	@Test
	void contextLoads() {
		try {
			service.remove(401);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
