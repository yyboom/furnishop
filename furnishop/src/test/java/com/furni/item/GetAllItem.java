package com.furni.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ItemDTO;
import com.furni.service.ItemService;

@SpringBootTest
class GetAllItem {

	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		List<ItemDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ItemDTO i : list) {
			System.out.println(i);
		}
	}

}
