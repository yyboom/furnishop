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
class InsertOrderpage {

	@Autowired
	OrderpageService service;
	@Autowired
	DetailorderService service1;

	@Test
	void contextLoads() {
		OrderpageDTO order = new OrderpageDTO(0, "id02", new Date("Thu, 17 Aug 2022 00:00:00 +900"), "네이버페이", 1, "Y",
				"할머니댁", "서울특별시 영등포구", "남지현", "010-2345-8746", "침대", 0, 0, null, null, null, 0);
		try {
			// int r = service.register1(order); //-> 1로 들어감
			service.register(order);
			int r = order.getOrderno();
			System.out.println("Register OK" + r);
			// for문으로 돌려주기
			DetailorderDTO detail = new DetailorderDTO(0, r, 100, "침대", "베이지", 2, "bed.jpg", "id02", 2192000);
			DetailorderDTO detail1 = new DetailorderDTO(0, r, 101, "옷장", "그레이", 2, "closet.jpg", "id02", 1378000);
			service1.register(detail);
			service1.register(detail1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
