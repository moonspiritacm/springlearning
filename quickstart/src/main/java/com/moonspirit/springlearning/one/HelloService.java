package com.moonspirit.springlearning.one;

import org.springframework.stereotype.Service;

/**
 * @ClassName      HelloService
 * @Description    ����ʵ���࣬λ��ҵ���߼��㣬����������Ϊ @Service
 *
 * @author         moonspirit
 * @date           2018��7��17��    ����4:23:59
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
