package com.chamba.shopping.serviceimpl;

import com.chamba.shopping.dto.ProductDTO;
import com.chamba.shopping.entity.Product;
import com.chamba.shopping.repository.IProductRepository;
import com.chamba.shopping.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductRepository productRepository;


    @Override
    public void addProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        productRepository.save(product);
    }

    @Override
    public void updateProduct(ProductDTO productDTO) {
        Product product = productRepository.findById(productDTO.getId()).get();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
