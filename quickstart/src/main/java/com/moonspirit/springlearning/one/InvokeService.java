package com.moonspirit.springlearning.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName      InvokeService
 * @Description    ����ʵ���࣬���� HelloService ʵ���书�ܣ�ʹ��ע�� @Autowired �����Զ�װ��
 *
 * @author         moonspirit
 * @date           2018��7��17��    ����4:26:57
 * @version        1.0.0
 */
@Service
public class InvokeService {

	@Autowired
	HelloService helloService;

	/**
	 * @MethodName       invokeHello
	 * @Description      TODO
	 *
	 * @param            name
	 * @return           String
	 * @throws
	 */
	public String invokeHello(String name) {
		return helloService.sayHello(name);
	}
}
