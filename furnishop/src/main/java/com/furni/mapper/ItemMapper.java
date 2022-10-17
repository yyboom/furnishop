package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.ItemDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface ItemMapper extends MyMapper<Integer, ItemDTO> {
	public List<ItemDTO> selectall1(Integer cateno) throws Exception;

	public List<ItemDTO> selectallcate(Integer cateno) throws Exception;

}
