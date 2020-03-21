package com.ex.pageobjects;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Retention(RUNTIME)
@Target(TYPE)
@Component
@Scope("prototype")
@Lazy
public @interface PageObjectDesktop {
	String value() default "";
}
