package com.furni.detailorder;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.DetailorderDTO;
import com.furni.service.DetailorderService;

@SpringBootTest
class GetAllDetailorder {

	@Autowired
	DetailorderService service;

	@Test
	void contextLoads() {
		List<DetailorderDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (DetailorderDTO d : list) {
			System.out.println(d);
		}
	}

}
