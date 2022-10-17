package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.WishlistDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface WishlistMapper extends MyMapper<Integer, WishlistDTO> {
	public List<WishlistDTO> wishall(String custid) throws Exception;
}
