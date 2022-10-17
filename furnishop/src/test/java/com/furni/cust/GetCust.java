package com.furni.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CustDTO;
import com.furni.service.CustService;

@SpringBootTest
class GetCust {

	@Autowired
	CustService service;

	@Test
	void contextLoads() {
		CustDTO cust = null;
		try {
			cust = service.get("id02");
			System.out.println(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
