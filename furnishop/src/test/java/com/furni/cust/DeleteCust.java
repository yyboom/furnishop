package com.furni.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.CustService;

@SpringBootTest
class DeleteCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("id11");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}