package com.furni.ship;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ShipDTO;
import com.furni.service.ShipService;

@SpringBootTest
class GetAllShip {

	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		List<ShipDTO> list = null;
		try {
			list = service.shipall("id09");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (ShipDTO c : list) {
			System.out.println(c);
		}

	}

}
