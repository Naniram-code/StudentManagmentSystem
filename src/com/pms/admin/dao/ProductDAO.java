package com.pms.admin.dao;

import com.pms.model.Product;

import java.util.List;

public interface ProductDAO {
    void addProduct();
    List<Product> viewProducts();
    Product viewProduct(int pid);
    void updateProduct(int pid);
    void deleteProduct(int pid);

}
