package com.furni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.WishlistDTO;
import com.furni.service.WishlistService;

@Controller
@RequestMapping("/wishlist")
public class WishController {

	@Autowired
	WishlistService service;

	String dir = "wishlist/";

	@RequestMapping("/wishlistdetail")
	public String wishlistdetail(Model model, String id) {
		List<WishlistDTO> wish = null;
		try {
			wish = service.wishall(id);
			model.addAttribute("wishlistdetail", wish);
		} catch (Exception e) {
			System.out.println("시스템 장애입니다.");
			e.printStackTrace(); // 시스템 장애 등, 현업에서는 시스템 장애 화면 뿌려지게 함
		}
		model.addAttribute("center", dir + "wishlistdetail");
		return "main";
	}

	@RequestMapping("/deletewish")
	public String deletewish(Model model, int wishno, String custid) {
		try {
			service.remove(wishno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:wishlistdetail?id=" + custid;
	}

}
