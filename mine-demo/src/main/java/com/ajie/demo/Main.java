package com.ajie.demo;

import com.ajie.demo.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/1
 */
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
		String address = ac.getBean("address", String.class);
		System.out.println(address);
	}
}
