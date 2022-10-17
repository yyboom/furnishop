package com.furni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furni.dto.DetailorderDTO;
import com.furni.dto.OrderpageDTO;
import com.furni.frame.MyService;
import com.furni.mapper.DetailorderMapper;
import com.furni.mapper.OrderpageMapper;

@Service
public class OrderpageService implements MyService<Integer, OrderpageDTO> {

	@Autowired
	OrderpageMapper mapper;

	@Autowired
	DetailorderMapper mapper1;

	@Override
	public void register(OrderpageDTO v) throws Exception {
		mapper.insert(v);

	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrderpageDTO v) throws Exception {
		mapper.update(v);

	}

	@Override
	public OrderpageDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrderpageDTO> get() throws Exception {
		return null;
	}

	public int register1(OrderpageDTO order) throws Exception {
		return mapper.register1(order);
	}

	public List<OrderpageDTO> orderall(String custid) throws Exception {
		return mapper.orderall(custid);
	}

	public List<OrderpageDTO> orderreview(String custid) throws Exception {
		return mapper.orderreview(custid);
	}
	// 주문상세 인서트할때
//	fun insertUserData (user: User, hobby: Hobby) {
//	    insertUser(user)
//	    /* user가 삽입된 후, user 객체에는 userId가 설정되어 있습니다. */
//	    hobby.userId = user.userId
//	    insertHobby(hobby)
//}
	// 이런방식으로 해도 될듯!

}
