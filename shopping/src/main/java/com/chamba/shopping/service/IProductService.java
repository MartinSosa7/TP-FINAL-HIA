package com.chamba.shopping.service;

import com.chamba.shopping.dto.ProductDTO;
import com.chamba.shopping.entity.Product;

import java.util.List;

public interface IProductService {

    void addProduct(ProductDTO product);
    void updateProduct(ProductDTO product);
    void deleteProduct(int id);
    List<Product> getProducts();
}
