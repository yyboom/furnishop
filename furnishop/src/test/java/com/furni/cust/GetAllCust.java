package com.furni.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CustDTO;
import com.furni.service.CustService;



@SpringBootTest
class GetAllCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<CustDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CustDTO c:list) {
			System.out.println(c);
		}
		
	}

}




