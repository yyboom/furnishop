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
public class ShipDTO {
	private int shipno;
	private int detailno;
	private String shipstatus;

	private String cust_id;
	private int order_no;
	private Date order_date;
	private String item_name;
	private int item_cnt;
	private int total_cnt;
	private String item_img;
	private int itemno;

}
