package com.furni.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.CateDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface CateMapper extends MyMapper<Integer, CateDTO> {

}
