package com.ajie.demo.listener;

import com.ajie.demo.event.MyEvent2;
import org.springframework.context.ApplicationListener;

import java.io.Serializable;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/4
 */
public class MyListener2 implements ApplicationListener<MyEvent2>, Serializable {
	private static final long serialVersionUID = 7100714597678207546L;

	@Override
	public void onApplicationEvent(MyEvent2 event) {
		System.out.println("进入监听器2：" + event);
	}
}
