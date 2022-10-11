package com.furni.service;

import java.util.List;

import com.furni.dto.ShipDTO;
import com.furni.frame.MyService;
import com.furni.mapper.ShipMapper;

public class ShipService implements MyService<Integer, ShipDTO>{
	
	ShipMapper mapper;

	@Override
	public void register(ShipDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(null);
		
	}

	@Override
	public void modify(ShipDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public ShipDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ShipDTO> get() throws Exception {
		return mapper.selectall();
	}

}
