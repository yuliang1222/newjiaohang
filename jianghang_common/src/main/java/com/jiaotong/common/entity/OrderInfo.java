package com.jiaotong.common.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.time.LocalTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单信息表
 * </p>
 *
 * @author dongyuefeng
 * @since 2020-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("Order_Info")
@ApiModel(value="OrderInfo对象", description="订单信息表")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "Id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "用户id")
    @TableField("User_Id")
    private String userId;

    @ApiModelProperty(value = "会员卡id")
    @TableField("Card_Id")
    private String cardId;

    @ApiModelProperty(value = "会员卡名称")
    @TableField("Card_Name")
    private String cardName;

    @ApiModelProperty(value = "规划师id")
    @TableField("Planner_Id")
    private String plannerId;

    @ApiModelProperty(value = "预约开始时间")
    @TableField("Start_Time")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "预约结束时间")
    @TableField("End_Time")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "订单状态 订单状态：0，待支付；1，待使用；2，已完成；3，支付失败；4，已取消")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "总时长")
    @TableField("Total_Duration")
    private LocalTime totalDuration;

    @ApiModelProperty(value = "总使用次数")
    @TableField("Total_Count")
    private Integer totalCount;

    @ApiModelProperty(value = "已用时长")
    @TableField("Used_Duration")
    private LocalTime usedDuration;

    @ApiModelProperty(value = "已用次数")
    @TableField("Used_Count")
    private Integer usedCount;

    @ApiModelProperty(value = "创建时间")
    @TableField("Create_Time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "接通类型 接通类型：0，一键接通；1，私人定制")
    @TableField("Contract_Type")
    private String contractType;

    @ApiModelProperty(value = "支付金额")
    @TableField("Pay_Amout")
    private BigDecimal payAmout;

    @ApiModelProperty(value = "微信预支付id")
    @TableField("Prepay_Id")
    private String prepayId;

    @ApiModelProperty(value = "支付时间")
    @TableField("Pay_Time")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "订单编号")
    @TableField("Order_No")
    private String orderNo;

    @ApiModelProperty(value = "会员卡类型 会员卡类型：0，体验卡；1，分钟卡；2，小时卡；3，兑换码")
    @TableField("Card_Type")
    private String cardType;

    @ApiModelProperty(value = "咨询方向id")
    @TableField("Service_Id")
    private String serviceId;


}
