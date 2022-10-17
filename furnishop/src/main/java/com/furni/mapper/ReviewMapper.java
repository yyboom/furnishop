package com.furni.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.furni.dto.ReviewDTO;
import com.furni.frame.MyMapper;

@Repository
@Mapper
public interface ReviewMapper extends MyMapper<String, ReviewDTO> {
	public List<ReviewDTO> reviewall(String custid) throws Exception;

	public List<ReviewDTO> selectall(String custid) throws Exception;

	public ReviewDTO insert1(ReviewDTO obj) throws Exception;

	public List<ReviewDTO> reviewitem(Integer itemno) throws Exception;

	public ReviewDTO insertitem(ReviewDTO obj) throws Exception;

	public ReviewDTO select1(Integer reviewno) throws Exception;
}
