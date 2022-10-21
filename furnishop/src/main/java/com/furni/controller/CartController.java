package com.furni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.CartDTO;
import com.furni.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

	String dir = "cart/";

	@Autowired
	CartService service;

	@RequestMapping("/get")
	public String get(Model model, String id) {
		//	int totalcnt=0, total_price=0;
		List<CartDTO> list = null;
		Integer i = 0;
		try {
		//	CartDTO cart = service.selectString(id);
		//	totalcnt += cart.getTotalcnt();
		//	total_price += cart.getTotal_price()*cart.getCartcnt();
			list = service.cartall(id);

			
			i = service.total_sum(id);
			model.addAttribute("list", list);
			model.addAttribute("sum", i);

		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir + "get");
		return "main";
	}

	@RequestMapping("/delete")
	public String delete(Model model, Integer cartno, String custid) {
		try {
			service.remove(cartno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:get?id=" + custid;
	}

}
