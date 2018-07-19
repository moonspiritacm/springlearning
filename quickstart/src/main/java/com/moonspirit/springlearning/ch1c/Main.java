package com.moonspirit.springlearning.ch1c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		AnnotationService annotationService = context.getBean(AnnotationService.class);
		annotationService.add();

		context.close();
	}
}
