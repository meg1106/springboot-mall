package com.yumeg.springbootmall.service.impl;

import com.yumeg.springbootmall.dao.ProductDao;
import com.yumeg.springbootmall.model.Product;
import com.yumeg.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
