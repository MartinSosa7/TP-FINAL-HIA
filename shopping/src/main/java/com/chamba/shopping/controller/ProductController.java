package com.chamba.shopping.controller;

import com.chamba.shopping.dto.ProductDTO;
import com.chamba.shopping.entity.Product;
import com.chamba.shopping.serviceimpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("products")
public class ProductController {

    final
    ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @RequestMapping("/add")
    ResponseEntity<?> addProduct(@RequestBody ProductDTO product) {
        productService.addProduct(product);
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/update")
    ResponseEntity<?> updateProduct(@RequestBody ProductDTO product) {
        productService.updateProduct(product);
        return ResponseEntity.ok().build();
    }

    @RequestMapping("/delete/{id}")
    ResponseEntity<?> deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        Map<String,String> response = new HashMap();
        response.put("message", "Product deleted successfully");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @RequestMapping("/getProducts")
    ResponseEntity<?> getProducts() {
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok().body(products);
    }
}
