package com.moonspirit.springlearning.ch2b;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @ClassName      Config
 * @Description    配置类，使用 @Value() 进行资源注入
 *                 使用注解 @PropertySource() 配置文件位置
 *
 * @author         moonspirit
 * @date           2018年7月19日    下午3:53:58
 * @version        1.0.0
 */
@Configuration
@ComponentScan("com.moonspirit.springlearning.ch2b")
@PropertySource("classpath:application.properties")
public class Config {

	/**
	 * 普通字符串
	 */
	@Value("I Love You!")
	private String normal;

	/**
	 * 操作系统属性
	 */
	@Value("#{systemProperties['os.name']}")
	private String osName;

	/**
	 * 表达式结果
	 */
	@Value("#{T(java.lang.Math).random() * 100.0}")
	private double randomNumber;

	/**
	 * 其他实体类的属性
	 */
	@Value("#{basicService.str}")
	private String fromAnother;

	/**
	 * 文件资源
	 */
	@Value("classpath:text.txt")
	private Resource testFile;

	/**
	 * 网址资源
	 */
	@Value("http://www.baidu.com")
	private Resource testUrl;

	/**
	 * 配置文件
	 */
	@Value("${book.name}")
	private String bookName;

	@Autowired
	private Environment environment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void printResource() {
		try {
			System.out.println("注入普通字符串：" + normal);
			System.out.println("注入操作系统属性：" + osName);
			System.out.println("注入表达式结果：" + randomNumber);
			System.out.println("注入其他类属性：" + fromAnother);
			System.out.println("注入文件资源：" + IOUtils.toString(testFile.getInputStream(), "UTF-8"));
			System.out.println("注入网址资源：" + IOUtils.toString(testUrl.getInputStream(), "UTF-8"));
			System.out.println("注入配置文件：" + bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
