package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :16140
 * @description :
 * @create :2022-06-17 08:50:00
 */
@Data
public class Shop {
    private Integer shopId;
    private String shopName;
    private String shopDesc;
    private String shopAddr;
    private String phone;
    private String shopImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //-1.不可用 0.审核中 1.可用
    private Integer enableStatus;
    //超级管理员对店家的提醒
    private String advice;
    private Area area;
    private PersonInfo owner;
    private ShopCategory shopCategory;
}
