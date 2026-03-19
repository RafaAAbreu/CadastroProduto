package com.rafael.product_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
    
    @GetMapping("product")
    public String GetProduct(){
        return "Retornando um produto";
    }
    
}
