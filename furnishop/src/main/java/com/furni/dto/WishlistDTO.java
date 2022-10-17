package com.furni.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class WishlistDTO {
	private int wishno;
	private String custid;
	private int itemno;

	private String item_name;
	private String item_color;
	private String item_size;

}
