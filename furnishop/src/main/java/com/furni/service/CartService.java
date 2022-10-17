package com.furni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furni.dto.CartDTO;
import com.furni.frame.MyService;
import com.furni.mapper.CartMapper;

@Service
public class CartService implements MyService<Integer, CartDTO> {

	@Autowired
	CartMapper mapper;

	@Override
	public void register(CartDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(CartDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public CartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CartDTO> get() throws Exception {
		return mapper.selectall();
	}

	public List<CartDTO> cartall(String custid) throws Exception {
		return mapper.cartall(custid);
	}

	public int total_sum(String custid) throws Exception {
		return mapper.total_sum(custid);
	}

	public CartDTO selectString(String custid) throws Exception {
		return mapper.selectString(custid);
	}
}
