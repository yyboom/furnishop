package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.ShipDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface ShipMapper extends MyMapper<Integer, ShipDTO> {
	public List<ShipDTO> shipall(String cust_id) throws Exception;

	public ShipDTO selectone(int detailno) throws Exception;

}
