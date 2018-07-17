package com.moonspirit.springlearning.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName      InvokeService
 * @Description    功能实体类，依赖 HelloService 类实现其功能，使用注解 @Autowired 进行自动装配
 *
 * @author         moonspirit
 * @date           2018年7月17日    下午4:26:57
 * @version        1.0.0
 */
@Service
public class InvokeService {

	@Autowired
	HelloService helloService;

	/**
	 * @MethodName       SayHello
	 * @Description      TODO
	 *
	 * @param            name
	 * @return           String
	 * @throws
	 */
	public String SayHello(String name) {
		return helloService.sayHello(name);
	}
}
