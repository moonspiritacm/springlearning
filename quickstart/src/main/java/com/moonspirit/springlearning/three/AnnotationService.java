package com.moonspirit.springlearning.three;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {

	@Action(name = "注解式拦截的add操作")
	public void add() {
	}
}
