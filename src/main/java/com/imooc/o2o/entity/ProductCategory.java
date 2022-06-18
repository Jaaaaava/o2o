package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :16140
 * @description :
 * @create :2022-06-18 13:58:00
 */
@Data
public class ProductCategory {
    private Long productCategoryId;
    private Long shopId;
    private String productCategoryName;
    private Integer priority;
    private Date createTime;
}
