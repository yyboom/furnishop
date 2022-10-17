package com.furni.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.ShipDTO;
import com.furni.service.ShipService;

@SpringBootTest
class GetShip {

	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		ShipDTO ship = null;
		try {
			ship = service.selectone(406);
			System.out.println(ship);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
