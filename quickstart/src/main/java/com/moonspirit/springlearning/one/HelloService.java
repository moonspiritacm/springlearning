package com.moonspirit.springlearning.one;

import org.springframework.stereotype.Service;

/**
 * @ClassName      HelloService
 * @Description    功能实体类，位于业务逻辑层，将该类声明为 @Service
 *
 * @author         moonspirit
 * @date           2018年7月17日    下午4:23:59
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
		return "Hello " + name + " !";
	}
}
