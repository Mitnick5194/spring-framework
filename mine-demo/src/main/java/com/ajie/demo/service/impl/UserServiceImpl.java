package com.ajie.demo.service.impl;

import com.ajie.demo.annotation.AopLog;
import com.ajie.demo.service.UserService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/4
 */
@Service
public class UserServiceImpl implements UserService, BeanNameAware {

	public UserServiceImpl() {
		System.out.println("sdfsd");
	}

	@AopLog
	@Override
	public Integer addUser() {
		return null;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
}
