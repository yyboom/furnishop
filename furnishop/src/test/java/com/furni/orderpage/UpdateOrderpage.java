package com.furni.orderpage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.OrderpageDTO;
import com.furni.service.OrderpageService;

@SpringBootTest
class UpdateOrderpage {

	@Autowired
	OrderpageService service;

	@Test
	void contextLoads() {
		OrderpageDTO order = new OrderpageDTO(332, "id01", null, "신용카드", 4, "Y", "집", "11", "홍말숙", "1111", null, 0, 0,
				null, null, null, 0);
		try {
			service.modify(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
