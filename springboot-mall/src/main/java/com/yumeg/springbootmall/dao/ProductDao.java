package com.yumeg.springbootmall.dao;

import com.yumeg.springbootmall.model.Product;


public interface ProductDao {
    Product getProductById(Integer productId);

}
