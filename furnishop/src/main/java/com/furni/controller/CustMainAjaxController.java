package com.furni.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furni.dto.CustDTO;
import com.furni.dto.WishlistDTO;
import com.furni.service.CustService;
import com.furni.service.WishlistService;

@RestController
public class CustMainAjaxController {
	
	@Autowired
	CustService cust_service;
	
	@Autowired
	WishlistService service;
	
	@RequestMapping("/checkid")
	public Object checkid(String cid){
		String result = "";
		//id가 데이터베이스에서 null값으로 나왔다면 register에서 새로 등록이 가능한 아이디로 됨!
		CustDTO cust = null;
		//데이터베이스에 연동!
		try {
			cust = cust_service.get(cid);
			if(cust != null) {
				result = "f";
			}else {
				result = "t";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping("/addwish")
	public Object addwish(WishlistDTO wish) {
		try {
			service.register(wish);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
