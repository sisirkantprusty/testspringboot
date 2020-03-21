package com.ex.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.ex.base.WebDriverSession;

@Component
public class PageObjectBeanPostProcessor implements BeanPostProcessor {

	@Lazy
	@Autowired
	private WebDriverSession driver;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().isAnnotationPresent(PageObjectDesktop.class)) {
			System.out.println("This is in Bean for page objects with annotation PageObjectDesktop processror");
			PageFactory.initElements(driver.getWebDriver(), bean);
		}else {
			System.out.println("This is in Bean for page objects without annotation PageObjectDesktop processror");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}
}
