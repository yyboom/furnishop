package com.furni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.ReviewDTO;
import com.furni.service.ReviewService;
import com.furni.frame.Util;

@Controller
@RequestMapping("/review")
public class MWRController {

	String dir = "review/";
	
	@Value("${reviewdir}")
	String reviewdir;
	
	@Autowired
	ReviewService service;
	
	
	@RequestMapping("/get")
	public String get(Model model,String id) {
		List<ReviewDTO> list = null;
		try {
			list = service.reviewall(id);
			model.addAttribute("list",list);
			model.addAttribute("center",dir+"get");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return "main";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, ReviewDTO obj) {
		String imgname = obj.getImg().getOriginalFilename();
		obj.setReviewimg(imgname);
		try {
			Util.saveFile(obj.getImg(), reviewdir);
			//하나 이상의 파일을 올리려면 이곳에서 추가
			System.out.println(obj);
			service.register(obj);
			//레지스터도 추가 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:get";
	}
}
