package com.jiaotong.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.io.Serializable;


/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author dongyuefeng
 * @since 2020-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("User_Info")
@Builder
@ApiModel(value="UserInfo对象", description="用户信息表")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "Id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "微信openid")
    @TableField("Wx_Open_Id")
    private String wxOpenId;

    @ApiModelProperty(value = "手机号")
    @TableField("Phone_No")
    private String phoneNo;

    @ApiModelProperty(value = "注册时间")
    @TableField("Create_Time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "是否已使用体验卡 是否已使用体验卡：0，未体验；1，已体验")
    @TableField("Experienced")
    private String Experienced;

    @ApiModelProperty(value = "是否规划师 是否规划师：0，否；1，是")
    @TableField("Planner_Type")
    private String plannerType;

    @ApiModelProperty(value = "微信sessionkey")
    @TableField("Session_Key")
    private String sessionKey;


}
