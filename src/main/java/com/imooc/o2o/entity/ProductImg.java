package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author :16140
 * @description :
 * @create :2022-06-18 13:56:00
 */
@Data
public class ProductImg {
    //主键ID
    private Integer productImgId;
    //图片地址
    private String imgAttr;
    //图片简介
    private String imgDesc;
    //权重，越大越在前面显示
    private Integer priority;
    //创建时间
    private Date createTime;
    //标明属于哪个商品的图片
    private Long productId;
}
