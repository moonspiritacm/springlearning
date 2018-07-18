package com.moonspirit.springlearning.three;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {

	/**
	 * @MethodName       annotationPointCut
	 * @Description      定义切点
	 *
	 * @param            
	 * @return           void
	 * @throws
	 */
	@Pointcut("@annotation(com.moonspirit.springlearning.three.Action)")
	public void annotationPointCut() {
	};

	/**
	 * @MethodName       after
	 * @Description      后置通知
	 *
	 * @param            @param joinPoint
	 * @return           void
	 * @throws
	 */
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注解式拦截，后置通知 " + action.name());
	}

	/**
	 * @MethodName       before
	 * @Description      前置通知
	 *
	 * @param            @param joinPoint
	 * @return           void
	 * @throws
	 */
	@Before("execution(* com.moonspirit.springlearning.three.MethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截," + method.getName());
	}
}
