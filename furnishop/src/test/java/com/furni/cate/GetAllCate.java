package com.furni.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CateDTO;
import com.furni.service.CateService;

@SpringBootTest
class GetAllCate {

	@Autowired
	CateService service;

	@Test
	void contextLoads() {
		List<CateDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CateDTO i : list) {
			System.out.println(i);
		}
	}

}
