package com.ajie.demo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/5
 */
@Aspect
@Component
public class LogAopAspect {
	public LogAopAspect(){
		System.out.println("sdfsdfd");
	}

	@Pointcut("@annotation(com.ajie.demo.annotation.AopLog)")
	public void pointCut() {

	}

	@Around("pointCut()")
	public void log(ProceedingJoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		System.out.println(args);
	}
}
