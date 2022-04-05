package com.ajie.demo.config;

import com.ajie.demo.service.UserService;
import com.ajie.demo.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/1
 */
@Component
@EnableAspectJAutoProxy
@Import({LogAopAspect.class})
public class BeanConfig {

	@Bean
	public String address() {
		return "ajie";
	}

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
}
