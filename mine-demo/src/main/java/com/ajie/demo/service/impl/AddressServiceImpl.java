package com.ajie.demo.service.impl;

import com.ajie.demo.service.AddressService;
import com.ajie.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/7
 */
@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private UserService userService;

	@Override
	public String getAddressByUserId(String id) {
		String user = userService.getUser(id);
		return user;
	}
}
