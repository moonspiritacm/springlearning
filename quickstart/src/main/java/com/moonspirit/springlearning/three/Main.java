package com.moonspirit.springlearning.three;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(Config.class);
		 DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		 MethodService demoMethodService = context.getBean(MethodService.class);
		 demoAnnotationService.add();
		 demoMethodService.add();
		 context.close();
	}
}

