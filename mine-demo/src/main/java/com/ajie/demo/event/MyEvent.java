package com.ajie.demo.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/4
 */
public class MyEvent extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = 7100714597678207546L;

	public MyEvent(Object source) {
		super(source);
	}
}
