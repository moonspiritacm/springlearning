package com.moonspirit.springlearning.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		InvokeService invokeService = context.getBean(InvokeService.class);
		System.out.println(invokeService.invokeHello("world"));
		context.close();
	}
}
