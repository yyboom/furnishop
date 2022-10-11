package com.furni.dto;

import java.util.Date;

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
public class ReviewDTO {
	private int reviewno;
	private String custid;
	private int itemno;
	private int rating;
	private String reviewcon;
	private String reviewdate;
	private String reviewimg;
	
	private String item_name;
	private String item_color;
	private String item_standard;
}
