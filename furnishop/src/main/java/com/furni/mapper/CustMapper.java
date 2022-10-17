package com.furni.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.CustDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface CustMapper extends MyMapper<String, CustDTO> {
	public void delete1(CustDTO cust) throws Exception;

}
