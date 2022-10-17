package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.DetailorderDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface DetailorderMapper extends MyMapper<Integer, DetailorderDTO> {
	public List<DetailorderDTO> detailall(String custid) throws Exception;

	public DetailorderDTO select1(Integer orderno) throws Exception;
}
