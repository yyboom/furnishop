package com.furni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furni.dto.ReviewDTO;
import com.furni.frame.MyService;
import com.furni.mapper.ReviewMapper;

@Service
public class ReviewService implements MyService<String, ReviewDTO>{

	@Autowired
	ReviewMapper mapper;
	
	@Override
	public void register(ReviewDTO v) throws Exception {
		mapper.insert(v);		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(ReviewDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public ReviewDTO get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ReviewDTO> get() throws Exception {
		return mapper.selectall();
	}

	public List<ReviewDTO> selectall(String custid) throws Exception {
		return mapper.selectall(custid);
	}
	
	public List<ReviewDTO> reviewall(String custid) throws Exception {
		return mapper.reviewall(custid);
	}
	
	public List<ReviewDTO> reviewitem(Integer itemno) throws Exception{
		return mapper.reviewitem(itemno);
	}
}









