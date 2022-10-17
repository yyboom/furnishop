package com.furni.orderpage;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.OrderpageDTO;
import com.furni.service.OrderpageService;

@SpringBootTest
class GetAllOrder {

	@Autowired
	OrderpageService service;

	@Test
	void contextLoads() {
		List<OrderpageDTO> list = null;
		try {
			list = service.orderall("id02");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(list);

	}
}
