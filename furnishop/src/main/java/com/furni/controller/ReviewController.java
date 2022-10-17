package com.furni.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.OrderpageDTO;
import com.furni.dto.ReviewDTO;
import com.furni.frame.Util;
import com.furni.service.OrderpageService;
import com.furni.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {

	String dir = "review/";

	@Value("${reviewdir}")
	String reviewdir;

	@Autowired
	ReviewService service;

	@Autowired
	OrderpageService or_service;

	@RequestMapping("/reinsert")
	public String reinsert(Model model, String id) {
		List<OrderpageDTO> order = null;

		try {
			order = or_service.orderreview(id);

			model.addAttribute("list", order);

		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir + "reinsert");
		return "main";
	}

	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, ReviewDTO obj) {
		String imgname = obj.getImg().getOriginalFilename();
		obj.setReviewimg(imgname);
		try {
			Util.saveFile(obj.getImg(), reviewdir);
			// 하나 이상의 파일을 올리려면 이곳에서 추가
			service.register(obj);
			// 레지스터도 추가
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:reinsert?id=" + obj.getCustid();
	}

}
