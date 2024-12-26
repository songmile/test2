package com.cg.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 账户实体类
 */
@Data
public class Account {
	//账户编号
	private String accountNo;
	//用户名称
	private String userName;
	//账户金额
	private double money;
	
}
