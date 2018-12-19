package com.offcn.wfe;

import org.springframework.beans.factory.annotation.Autowired;

import com.offcn.mapper.ShiroUserMapper;

/**
 * 
 *	@package:com.offcn.wfe
 *  description:
 * 	@author WFE
 *	@date :2018年12月19日
 *
 */
public class MyTest01 {
	
	@Autowired
	private ShiroUserMapper shiroUserMapper;
	
	public static void main(String[] args) {
		System.out.println();
	}
}
