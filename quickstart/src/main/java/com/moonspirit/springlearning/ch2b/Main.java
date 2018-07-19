package com.moonspirit.springlearning.ch2b;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName      Main
 * @Description    执行入口
 *
 * @author         moonspirit
 * @date           2018年7月19日    下午5:07:55
 * @version        1.0.0
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Config resourceService = context.getBean(Config.class);
		resourceService.printResource();
		context.close();
	}
}
