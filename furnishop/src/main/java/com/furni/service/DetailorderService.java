package com.furni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furni.dto.DetailorderDTO;
import com.furni.frame.MyService;
import com.furni.mapper.DetailorderMapper;

@Service
public class DetailorderService implements MyService<Integer, DetailorderDTO> {

	@Autowired
	DetailorderMapper mapper;

	@Override
	public void register(DetailorderDTO v) throws Exception {
		mapper.insert(v);

	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);

	}

	@Override
	public void modify(DetailorderDTO v) throws Exception {
		mapper.update(v);

	}

	@Override
	public DetailorderDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<DetailorderDTO> get() throws Exception {
		return null;
	}

	public List<DetailorderDTO> detailall(String custid) throws Exception {
		return mapper.detailall(custid);

	}

	public DetailorderDTO select1(Integer orderno) throws Exception {
		return mapper.select1(orderno);
	}
}
