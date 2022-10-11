package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.OrderpageDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface OrderpageMapper extends MyMapper<Integer, OrderpageDTO>{
	public List<OrderpageDTO> orderall(String custid) throws Exception;
}
