package com.moonspirit.springlearning.one;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName      Config
 * @Description    配置类，管理依赖注入，使用注解声明为 @Configuration；注解 @ComponentScan("") 扫描指定包内所有 Spring bean 注解，并添加到到容器中。
 *
 * @author         moonspirit
 * @date           2018年7月18日    上午10:02:24
 * @version        1.0.0
 */
@Configuration
@ComponentScan("com.moonspirit.springlearning.one")
public class Config {

}
