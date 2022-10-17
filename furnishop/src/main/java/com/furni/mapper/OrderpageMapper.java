package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.DetailorderDTO;
import com.furni.dto.OrderpageDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface OrderpageMapper extends MyMapper<Integer, OrderpageDTO> {
	public int register1(OrderpageDTO order) throws Exception;

	public List<OrderpageDTO> orderall(String custid) throws Exception;

	public void insert1(OrderpageDTO order, DetailorderDTO detail) throws Exception;

	public List<OrderpageDTO> orderreview(String custid) throws Exception;
}
