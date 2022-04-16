package com.ajie.demo.service.impl;

import com.ajie.demo.annotation.AopLog;
import com.ajie.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/7
 */
//@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private UserServiceImpl userService;

	@AopLog
	@Override
	public String getAddressByUserId(String id) {
		String user = userService.getUser(id);
		return user;
	}
}
