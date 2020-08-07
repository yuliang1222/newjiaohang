package com.jiaotong.jiaohangweb.service.impl;

import com.jiaotong.common.entity.UserInfo;
import com.jiaotong.jiaohangweb.mapper.UserInfoMapper;
import com.jiaotong.jiaohangweb.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author dongyuefeng
 * @since 2020-08-06
 */
@com.alibaba.dubbo.config.annotation.Service
@Component
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
