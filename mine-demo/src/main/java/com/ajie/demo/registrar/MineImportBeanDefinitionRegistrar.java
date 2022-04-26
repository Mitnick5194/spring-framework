package com.ajie.demo.registrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: niezhenjie
 * @Date: 2022/4/19
 */
public class MineImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	public MineImportBeanDefinitionRegistrar(){
		System.out.println("abc");
	}
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println(importingClassMetadata);
	}
}
