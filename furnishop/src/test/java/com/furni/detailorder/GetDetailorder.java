package com.furni.detailorder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.DetailorderDTO;
import com.furni.service.DetailorderService;

@SpringBootTest
class GetDetailorder {

	@Autowired
	DetailorderService service;

	@Test
	void contextLoads() {
		DetailorderDTO detail = null;
		try {
			detail = service.get(400);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(detail);
	}

}
