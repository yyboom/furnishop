package com.furni.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderpageDTO {
	private int orderno;
	private String custid;
	private Date orderdate;
	private String orderpay;
	private int itemcnt;
	private String elevator;
	private String shipname;
	private String shipaddr;
	private String reciever;
	private String recievertel;

	// 조인
	private String item_name;
	private int item_price;
	private int total_price;
	private String item_img;
	private String item_color;
	private String item_size;
	private int item_no;

}
