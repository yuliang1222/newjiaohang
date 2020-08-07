/**
 * ClassName:webService
 * Author:Administrator
 * Date:2020/8/6 000617:01
 * Description:TODO
 */
package com.jiaotong.jiaohangweb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiaotong.jiaohangweb.service.webService;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: yuliang
 * @Date: 2020/8/6 0006 17:01
 */
@Service
@Component
public class webServiceImp implements webService {
	@Override
	public Object get() {
		return new Date();
	}
}
