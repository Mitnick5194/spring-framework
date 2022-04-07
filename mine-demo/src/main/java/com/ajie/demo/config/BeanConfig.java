package com.ajie.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/1
 */
@Component
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"com.ajie.demo"})
//@Import({LogAopAspect.class})
public class BeanConfig {

}
