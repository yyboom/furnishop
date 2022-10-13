package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.CartDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer, CartDTO>{
	public List<CartDTO> cartall(String custid) throws Exception;
}
