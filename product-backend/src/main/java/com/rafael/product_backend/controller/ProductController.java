package com.rafael.product_backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.product_backend.model.Product;



@RestController
public class ProductController {
    
    @GetMapping("product")
    public Product GetProduct(){

        Product p = new Product();
        
        p.setId(1);
        p.setName("Product");
        p.setPrice(5000.00);

        return p;
    }

    @GetMapping("products")
    public List<Product> GetProducts(){
    
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Product 1");
        p1.setPrice(5000.00);

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("Product 2");
        p2.setPrice(6000.00);

        Product p3 = new Product();
        p3.setId(3);
        p3.setName("Product 3");
        p3.setPrice(7000.00);

    List<Product> products = new ArrayList<>();
    
        products.add(p1);
        products.add(p2);
        products.add(p3);

        return products;
    }
    
}
