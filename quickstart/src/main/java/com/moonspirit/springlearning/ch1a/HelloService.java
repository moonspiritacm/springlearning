package com.moonspirit.springlearning.ch1a;

import org.springframework.stereotype.Service;

/**
 * @ClassName      HelloService
 * @Description    功能实体类，位于业务逻辑层，使用注解声明为 @Service
 *
 * @author         moonspirit
 * @date           2018年7月18日    上午10:58:38
 * @version        1.0.0
 */
@Service
public class HelloService {

	/**
	 * @MethodName       sayHello
	 * @Description      TODO
	 *
	 * @param            name
	 * @return           String
	 * @throws
	 */
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}
}
