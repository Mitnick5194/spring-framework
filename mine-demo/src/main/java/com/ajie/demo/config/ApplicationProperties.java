package com.ajie.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: niezhenjie
 * @Date: 2022/10/31
 */
@PropertySource("classpath:application.properties")
@Component
public class ApplicationProperties {

	private String name;

	public String getName() {
		return name;
	}

	@Value("${name}")
	public void setName(String name) {
		this.name = name;
	}
}
