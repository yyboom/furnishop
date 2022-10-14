package com.furni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.ItemDTO;
import com.furni.service.CateService;
import com.furni.service.ItemService;

@Controller
@RequestMapping("/item")
public class HController {
	
	String dir="item/";
	
	@Autowired
	ItemService service;
	
	@Autowired
	CateService service1;
	
	@RequestMapping("/bedroom")
	public String bedroom(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.selectallcate(1);
			model.addAttribute("list", list);
			model.addAttribute("center", dir+"bedroomcenter");
		} catch (Exception e) {
			System.out.println("시스템 장애입니다.");
			e.printStackTrace();  // 시스템 장애 등, 현업에서는 시스템 장애 화면 뿌려지게 함
		}
		return "main";
	}

	@RequestMapping("/livingroom")
	public String livingroom(Model model) {
		List<ItemDTO> list2 = null;
		try {
			list2 = service.selectallcate(2);
			model.addAttribute("list2", list2);
			model.addAttribute("center", dir+"livingroomcenter");
		} catch (Exception e) {
			System.out.println("시스템 장애입니다.");
			e.printStackTrace();  // 시스템 장애 등, 현업에서는 시스템 장애 화면 뿌려지게 함
		}
		return "main";
	}
	
	@RequestMapping("/kitchen")
	public String kitchen(Model model) {
		List<ItemDTO> list3 = null;
		try {
			list3 = service.selectallcate(3);
			model.addAttribute("list3", list3);
			model.addAttribute("center", dir+"kitchencenter");
		} catch (Exception e) {
			System.out.println("시스템 장애입니다.");
			e.printStackTrace();  // 시스템 장애 등, 현업에서는 시스템 장애 화면 뿌려지게 함
		}
		return "main";
	}
	
	@RequestMapping("/detail")
	public String detail(Model model, Integer id) {
		ItemDTO item=null;
		try {
			item=service.get(id);
			model.addAttribute("detail", item);
			model.addAttribute("center", dir+"detail");
		} catch (Exception e) {
			System.out.println("시스템 장애입니다.");
			e.printStackTrace();  // 시스템 장애 등, 현업에서는 시스템 장애 화면 뿌려지게 함
		}
		return "main";
	}
	
	
}
