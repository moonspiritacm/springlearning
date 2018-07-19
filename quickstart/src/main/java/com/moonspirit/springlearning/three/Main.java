package com.moonspirit.springlearning.three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		AnnotationService annotationService = context.getBean(AnnotationService.class);
		annotationService.add();
		MethodService methodService = context.getBean(MethodService.class);
		methodService.add();

		context.close();
	}
}
