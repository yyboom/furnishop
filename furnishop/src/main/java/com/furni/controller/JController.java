package com.furni.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JController {
	@RequestMapping("/order")
	public String main() {
		return "main";
	}
}
