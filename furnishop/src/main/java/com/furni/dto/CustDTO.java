package com.furni.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustDTO {
	private String custid;
	private String custpwd;
	private String custname;
	private String custaddr;
	private String custtel;
	private String custmail;
	private Date custdate;
	private String withdraw;
	private int custbirth;
	
}
