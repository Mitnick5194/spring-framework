package com.ajie.demo.listener;

import com.ajie.demo.event.MyEvent;
import org.springframework.context.ApplicationListener;

import java.io.Serializable;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/4
 */
public class MyListener implements ApplicationListener<MyEvent>, Serializable {
	private static final long serialVersionUID = 7100714597678207546L;

	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println("进入监听器1：" + event);
	}
}
