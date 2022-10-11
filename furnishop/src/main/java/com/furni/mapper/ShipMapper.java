package com.furni.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.ShipDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface ShipMapper extends MyMapper<Integer, ShipDTO>{

}
