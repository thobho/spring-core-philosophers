package com.thobho.tut.spring.core.beans.philosopher;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PhylosophyBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("heavyQuestion".equals( beanName )){
			HeavyQuestion concreteBean = (HeavyQuestion) bean;
			concreteBean.setQuestion( concreteBean.getQuestion() + "Who knows???" );
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}
