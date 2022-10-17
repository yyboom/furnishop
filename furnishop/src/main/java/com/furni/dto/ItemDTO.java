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
public class ItemDTO {
	private int itemno;
	private int cateno;
	private String itemname;
	private int itemprice;
	private String itemcolor;
	private String itemsize;
	private String itemimg;
	private String itemimg1;
	private int itemstock;
	private int itemsell;

	private int item_cnt;

}
