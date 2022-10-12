package com.furni.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.furni.dto.CustDTO;
import com.furni.service.CustService;

@Controller
public class CYYController {

	@Autowired
	CustService cust_service;

	@RequestMapping("/")
	public String main() {
		return "main";
	}

	// login
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center", "login");
		return "main";
	}

	// register
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center", "register");
		return "main";
	}

	// loginimpl
	@RequestMapping("/loginimpl")
	public String loginimpl(String custid, String custpwd, Model model, HttpSession session) {
		CustDTO cust = null;
		try {
			cust = cust_service.get(custid);
			if (cust == null) {
				model.addAttribute("center", "loginfail");
			} else {
				if (custpwd.equals(cust.getCustpwd())) {
					session.setAttribute("logincust", cust);
					model.addAttribute("center", "loginok");
					// id,pwd가 다 아닐 때
				} else {
					model.addAttribute("center", "loginfail");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}

	// registerimpl

	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, CustDTO cust, HttpSession session) {
		// custservice를 이용해서 database로 보내주기 위한 부분!
		try {
			// 회원가입이 정상일 때!!
			cust_service.register(cust);
			// 회원가입을 했을 때 자동으로 로그인이 된 것!
			session.setAttribute("logincust", cust);
			// 정상일때는
			model.addAttribute("center", "registerok");
			// 객체를 넣을 수도 있음!
			model.addAttribute("rid", cust);
		} catch (Exception e) {
			// 중복된 id를 넣을 때는 !!registerfail로 가게 한다.
			model.addAttribute("center", "registerfail");
			// registerfail page에 특정 값을 내보낼 때 model사용함! 이것이 tymleaf가 하는 일!
			model.addAttribute("fid", cust.getCustid());
		}

		return "main";
	}

}
