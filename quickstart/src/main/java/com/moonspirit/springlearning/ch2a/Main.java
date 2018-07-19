package com.moonspirit.springlearning.ch2a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		SingletonService s1 = context.getBean(SingletonService.class);
		SingletonService s2 = context.getBean(SingletonService.class);
		PrototypeService p1 = context.getBean(PrototypeService.class);
		PrototypeService p2 = context.getBean(PrototypeService.class);

		System.out.println("单例---------s1与s2是否相等：" + s1.equals(s2));
		System.out.println("多例---------p1与p2是否相等：" + p1.equals(p2));

		context.close();
	}
}
