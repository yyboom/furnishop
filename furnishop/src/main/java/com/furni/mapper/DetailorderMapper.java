package com.furni.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.DetailorderDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface DetailorderMapper extends MyMapper<Integer, DetailorderDTO>{

}
