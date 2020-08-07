/**
 * ClassName:EenApplication
 * Author:Administrator
 * Date:2020/8/6 000616:10
 * Description:TODO
 */
package com.jiaotong.jiaohangweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaotong.jiaohangweb.service.webService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yuliang
 * @Date: 2020/8/6 0006 16:10
 */
@Slf4j
@CrossOrigin
@RestController
@Api(tags = "EenApplication", description = "2.3我的环境配置)")
@RequestMapping("/env")
public class EenApplicationController {


	@Reference
	private webService webService;

	@Value("${common.name}")
	private String common_name;

	@Autowired
	private ConfigurableApplicationContext applicationContext;

	@ApiOperation(value = "2.3.01我的理财-主界面")
	@PostMapping(value = "/queryMyFinancialProductsMainPage")
	public Object queryMyFinancialProductsMainPage() {

		return applicationContext.getEnvironment().getProperty("common.name");

	}

	@ApiOperation(value = "我的理财-主界面")
	@PostMapping(value = "/queryMyFinancialPro")
	public Object queryMyFinancialProductsMainPage1() {
		return webService.get();

	}
}
