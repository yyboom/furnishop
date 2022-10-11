package com.furni.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ShipDTO;
import com.furni.service.ShipService;


@SpringBootTest
class UpdateShip {

	@Autowired
	ShipService service;
	
	@Test
	void contextLoads() {
		ShipDTO ship = new ShipDTO(210, "배송완료");
		try {
			service.modify(ship);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

