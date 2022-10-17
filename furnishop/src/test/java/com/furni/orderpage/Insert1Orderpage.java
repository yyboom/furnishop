package com.furni.orderpage;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.DetailorderDTO;
import com.furni.dto.OrderpageDTO;
import com.furni.service.DetailorderService;
import com.furni.service.OrderpageService;

@SpringBootTest
class Insert1Orderpage {

	@Autowired
	OrderpageService service;
	@Autowired
	DetailorderService service1;

	@Test
	void contextLoads() {
		OrderpageDTO order = new OrderpageDTO(0, "id02", new Date("Thu, 17 Aug 2022 00:00:00 +900"), "네이버페이", 1, "Y",
				"할머니댁", "서울특별시 영등포구", "남지현", "010-2345-8746", "침대", 0, 0, null, null, null, 0);
		DetailorderDTO detail = new DetailorderDTO(0, 0, 100, null, null, 0, null, null, 0);
		try {
			// int r = service.register1(order); //-> 1로 들어감
			service.register(order);

//	           service1.register(detail1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(order);
		System.out.println(detail);

	}

}
