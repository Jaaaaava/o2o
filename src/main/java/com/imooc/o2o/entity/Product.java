package com.imooc.o2o.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author :16140
 * @description :
 * @create :2022-06-17 09:14:00
 */
@Data
public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    //简略图
    private String imgAddr;
    private String normalPrice;
    //促销价格
    private String promotionPrice;
    private Date createTime;
    private Date lastEditTime;
    //-1.不可用;0.下架;1.在前端展示系统展示
    private Integer enableStatus;
    private List<ProductImg> productImgList;
    private ProductCategory productCategory;
    private Shop shop;
}
