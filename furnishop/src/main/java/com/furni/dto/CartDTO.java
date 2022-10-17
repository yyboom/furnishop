package com.furni.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CartDTO {
	private int cartno;
	private String custid;
	private int itemno;
	private int cartcnt;

	private String item_name;
	private int item_price;
	private String item_color;
	private String item_img;
	private String item_size;
	private int total_price;
	private int total_sum;

}
