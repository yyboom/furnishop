package com.furni.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CustDTO;
import com.furni.service.CustService;

@SpringBootTest
class UpdateCust {

	@Autowired
	CustService service;

	@Test
	void contextLoads() {
		CustDTO cust = new CustDTO("id11", "pwd11", "조윤영", "경기도 용인시", "010-5555-5555", "whdbsdud37@naver.com", null, 0,
				19980307);
		try {
			service.modify(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
