package com.ajie.demo.service.impl;

import com.ajie.demo.service.AddressService;
import com.ajie.demo.service.UserService;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/4
 */
@Service
public class UserServiceImpl implements UserService,  BeanNameAware {

	//@Autowired
	private AddressService addressService;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public UserServiceImpl() {
	}

	//@Override
	@Transactional
	public String getUser(String id) {
		jdbcTemplate.execute("INSERT INTO `demo`.`student` (`test`, `id`, `stu_name`, `c_id`, `score`) VALUES (NULL, 12, '王八2', 2, 98)");
		throw new RuntimeException();
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
