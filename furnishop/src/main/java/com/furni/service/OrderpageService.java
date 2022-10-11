package com.furni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furni.dto.OrderpageDTO;
import com.furni.frame.MyService;
import com.furni.mapper.OrderpageMapper;

@Service
public class OrderpageService implements MyService<Integer,OrderpageDTO>{
	
	@Autowired
	OrderpageMapper mapper;
	
	@Override
	public void register(OrderpageDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrderpageDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public OrderpageDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrderpageDTO> get() throws Exception {
		return mapper.selectall();
	}
	

}
