package com.ajie.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/1
 */
@Component
public class BeanConfig {

	public BeanConfig(){
		System.out.println("abdf");
	}

	@Bean
	public String address() {
		return "ajie";
	}
}
