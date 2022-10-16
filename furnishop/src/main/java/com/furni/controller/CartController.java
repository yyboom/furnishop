package com.furni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.CartDTO;
import com.furni.dto.ReviewDTO;
import com.furni.service.CartService;
import com.furni.service.ReviewService;

@Controller
@RequestMapping("/cart")
public class CartController {

	String dir = "cart/";
	
	@Autowired
	CartService service;
	
	
	@RequestMapping("/get")
	public String get(Model model,String id,CartDTO cart) {
		List<CartDTO> list = null;
		try {
			list = service.cartall(id);
			int i = service.total_sum(id);
			model.addAttribute("list",list);
			model.addAttribute("sum",i);
			model.addAttribute("center",dir+"get");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	@RequestMapping("/delete")
	public String delete(Model model, Integer cartno,String custid) {
		try {
			service.remove(cartno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:get?id="+ custid;
	}
	
}










