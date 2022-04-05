package com.ajie.demo;

import com.ajie.demo.config.BeanConfig;
import com.ajie.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/1
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
		/*String address = ac.getBean("address", String.class);
		System.out.println(address);*/
	/*	ac.addApplicationListener(new MyListener());
		ac.addApplicationListener(new MyListener2());
		ac.publishEvent(new MyEvent("这是我的自定义事件1"));
		ac.publishEvent(new MyEvent2("这是我的自定义事件2"));*/
		//UserServiceImpl
		UserService userService = ac.getBean("userService", UserService.class);
		userService.addUser();
	}

}
