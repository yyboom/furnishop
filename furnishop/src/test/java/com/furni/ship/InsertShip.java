package com.furni.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.dto.CustDTO;
import com.furni.dto.ShipDTO;
import com.furni.service.CustService;
import com.furni.service.ShipService;

@SpringBootTest
class InsertShip {

	@Autowired
	ShipService service;
	
	@Test
	void contextLoads() {
		ShipDTO ship = new ShipDTO(0, "배송출고");
		try {
			service.register(ship);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

