package com.moonspirit.springlearning.three;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

	@Action(name = "自定义注解")
	public void add() {
		System.out.println("正在执行 AnnotationService.add() 方法");
	}
}
