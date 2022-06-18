package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :16140
 * @description :
 * @create :2022-06-17 08:43:00
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
