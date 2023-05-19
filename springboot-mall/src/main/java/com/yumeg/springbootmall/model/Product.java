package com.yumeg.springbootmall.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yumeg.springbootmall.constant.ProductCategory;
import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;

    // Date 類型預設使用英國格林威治時區（ＧＭＴ＋0）
    // 在application.properties中設定GMT+8即可更改時間格式
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date lastModifiedDate;

}
