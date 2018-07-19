package com.moonspirit.springlearning.ch2b;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Config resourceService = context.getBean(Config.class);
		resourceService.printResource();
		context.close();
	}
}
