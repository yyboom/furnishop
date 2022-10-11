package com.furni.orderpage;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.OrderpageDTO;
import com.furni.service.OrderpageService;

@SpringBootTest
class InsertOrderpage {

	@Autowired
	OrderpageService service;
	
	@Test
	void contextLoads() {
		OrderpageDTO order = new OrderpageDTO(0,"id09",new Date("Thu, 17 Aug 2022 00:00:00 +900"),"네이버페이", 1,"Y", "할머니댁","서울특별시 영등포구","남지현","010-2345-8746", null, 0);
		try {
			service.register(order);
		//	System.out.println("ok"); 테스트용
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
