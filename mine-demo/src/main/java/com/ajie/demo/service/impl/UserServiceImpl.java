package com.ajie.demo.service.impl;

import com.ajie.demo.service.AddressService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/4
 */
@Service
public class UserServiceImpl implements/* UserService, */ BeanNameAware {

	@Autowired
	private AddressService addressService;

	public UserServiceImpl() {
	}

	//@Override
	public String getUser(String id) {
		return id;
	}

	//@AopLog
	//@Override
	public Integer addUser() {
		return null;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
}
