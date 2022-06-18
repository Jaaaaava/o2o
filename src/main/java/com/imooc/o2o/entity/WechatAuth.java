package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :16140
 * @description :
 * @create :2022-06-17 08:21:00
 */
@Data
public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;
}
