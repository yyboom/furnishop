package com.furni.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.furni.service.ShipService;

@SpringBootTest
class DeleteShip {

	@Autowired
	ShipService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(210);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}