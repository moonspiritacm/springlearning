package com.moonspirit.springlearning.four;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		MethodService methodService = context.getBean(MethodService.class);
		methodService.add();

		context.close();
	}
}
