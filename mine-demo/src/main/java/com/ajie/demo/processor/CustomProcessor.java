package com.ajie.demo.processor;

import com.ajie.demo.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 自己定义的后置处理器
 *
 * @Author: niezhenjie
 * @Date: 2022/4/17
 */
@Component
public class CustomProcessor implements BeanPostProcessor {

	private List<UserService> userServiceList = new ArrayList<>();

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserService) {
			userServiceList.add((UserService) bean);
		}
		return bean;
	}
}
