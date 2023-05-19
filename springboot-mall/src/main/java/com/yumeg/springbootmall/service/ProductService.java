package com.yumeg.springbootmall.service;

import com.yumeg.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    // 表示此ProductService 提供一個功能，可根據productId取到商品數據

}
