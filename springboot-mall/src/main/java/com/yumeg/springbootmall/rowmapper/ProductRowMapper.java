package com.yumeg.springbootmall.rowmapper;

import com.yumeg.springbootmall.constant.ProductCategory;
import com.yumeg.springbootmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    // 加上泛型表示要轉換成product 這個java class

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));

        String productStr = rs.getString("category");
        ProductCategory category = ProductCategory.valueOf(productStr);
        product.setCategory(category);

        // product.setCategory(ProductCategory.valueOf(rs.getString("category")));
        // 直接將ＤＢ取出來的String類型的字串，轉換成ProductCategory的Enum值，再傳入set方法中做設定

        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        product.setCreatedDate(rs.getDate("created_date"));
        product.setLastModifiedDate(rs.getDate("last_modified_date"));


        return product;
    }

}
