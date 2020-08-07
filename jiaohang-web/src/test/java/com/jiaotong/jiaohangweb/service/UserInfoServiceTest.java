package com.jiaotong.jiaohangweb.service;
import java.time.LocalDateTime;

import com.jiaotong.common.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: yuliang
 * @Date: 2020/8/6 0006 19:52
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoServiceTest {
	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void get() {
		UserInfo builder = UserInfo.builder().build();
		builder.setWxOpenId("2");
		builder.setPhoneNo("3");
		builder.setCreateTime(LocalDateTime.now());
		builder.setExperienced("4");
		builder.setPlannerType("5");
		builder.setSessionKey("6");
		boolean save = userInfoService.save(builder);
		System.out.println(save);

	}
}