package com.furni.orderpage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.OrderpageDTO;
import com.furni.service.OrderpageService;

@SpringBootTest
class GetOrderpage {

	@Autowired
	OrderpageService service;

	@Test
	void contextLoads() {
		OrderpageDTO order = null;
		try {
			order = service.get(300);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(order);
	}

}
