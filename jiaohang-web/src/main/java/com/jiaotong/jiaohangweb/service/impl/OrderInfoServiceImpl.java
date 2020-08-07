package com.jiaotong.jiaohangweb.service.impl;

import com.jiaotong.common.entity.OrderInfo;
import com.jiaotong.jiaohangweb.mapper.OrderInfoMapper;
import com.jiaotong.jiaohangweb.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单信息表 服务实现类
 * </p>
 *
 * @author dongyuefeng
 * @since 2020-08-06
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
