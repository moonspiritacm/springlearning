package com.moonspirit.springlearning.ch2b;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName      BasicService
 * @Description    被注入的实体类
 *
 * @author         moonspirit
 * @date           2018年7月19日    下午3:52:41
 * @version        1.0.0
 */
@Service
public class BasicService {

	@Value("BasicService 中的属性")
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
