package com.furni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furni.dto.ShipDTO;
import com.furni.frame.MyService;
import com.furni.mapper.ShipMapper;

@Service
public class ShipService implements MyService<Integer, ShipDTO> {

	@Autowired
	ShipMapper mapper;

	@Override
	public void register(ShipDTO v) throws Exception {
		mapper.insert(v);

	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);

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

	public List<ShipDTO> shipall(String cust_id) throws Exception {
		return mapper.shipall(cust_id);
	}

	public ShipDTO selectone(int detailno) throws Exception {
		return mapper.selectone(detailno);
	}

}
