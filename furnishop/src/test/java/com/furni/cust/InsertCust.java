package com.furni.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CustDTO;
import com.furni.service.CustService;

@SpringBootTest
class InsertCust {

	@Autowired
	CustService service;

	@Test
	void contextLoads() {
		CustDTO cust = new CustDTO(null, null, null, null, null, null, null, 0, 0);
		try {
			service.register(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
