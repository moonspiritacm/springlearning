package com.moonspirit.springlearning.ch2a;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName      PrototypeService
 * @Description    多例，每次调用都会新建  bean 实例，@scope("prototype")
 *
 * @author         moonspirit
 * @date           2018年7月19日    下午2:11:24
 * @version        1.0.0
 */
@Service
@Scope("prototype")
public class PrototypeService {

}
