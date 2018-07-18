package com.moonspirit.springlearning.three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 AnnotationService annotationService = context.getBean(AnnotationService.class);
		 MethodService methodService = context.getBean(MethodService.class);
		 annotationService.add();
		 methodService.add();
		 context.close();
	}
}

