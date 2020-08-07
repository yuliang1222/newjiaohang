package com.jiaotong.jiaohangweb.job.handler;/**
 * @Author: yuliang
 * @Date: 2020/8/7 0007 8:56
 */

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

@Component
public class yuliangHandler extends IJobHandler {

	@XxlJob(value = "yuliangHandler")
	@Override
	public ReturnT<String> execute(String s) throws Exception {

		Boolean successFlag = true;
		System.out.println("=====启动定时任务yuliangHandler=====");
		XxlJobLogger.log("=====启动定时任务yuliangHandler=====");
		if (successFlag) {
			return ReturnT.SUCCESS;
		} else {
			return ReturnT.FAIL;
		}
	}
}