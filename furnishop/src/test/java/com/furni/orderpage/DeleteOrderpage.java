package com.furni.orderpage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.OrderpageService;

@SpringBootTest
class DeleteOrderpage {

	@Autowired
	OrderpageService service;

	@Test
	void contextLoads() {
		try {
			service.remove(301);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
