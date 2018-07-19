package com.moonspirit.springlearning.three;

import org.springframework.stereotype.Service;

/**
 * @ClassName      MethodService
 * @Description    基于方法规则的被拦截类，不使用 AOP 相关的注解声明
 *
 * @author         moonspirit
 * @date           2018年7月18日    下午3:04:05
 * @version        1.0.0
 */
@Service
public class MethodService {

	public void add() {
		System.out.println("正在执行 AnnotationService.add() 方法");
	}
}
