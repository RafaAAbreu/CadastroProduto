package com.rafael.product_backend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.rafael.product_backend.model.Product;





@RestController
public class ProductController {
    
    private List<Product> products = Arrays.asList(
        new Product( 1, "Product 1", 5000.00),
        new Product( 2, "Product 2", 6000.00),
        new Product( 3, "Product 3", 7000.00)
    );
    
    //Construtor para inicializar a lista de produtos
    // @PostConstruct
    // public void init(){

    //     Product p1 = new Product( 1, "Product 1", 5000.00);
    //     Product p2 = new Product( 2, "Product 2", 6000.00);
    //     Product p3 = new Product( 3, "Product 3", 7000.00);

    //     products.add(p1);
    //     products.add(p2);
    //     products.add(p3);

    // }


    @GetMapping("products/{id}")
    public ResponseEntity<Product> GetProduct(@PathVariable int id){

        // if(id <= products.size() && id > 0){
        //     return ResponseEntity.ok(products.get(id - 1 ));
        // } else {
        //     throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not found");
        // }

        Product prod = products.stream()
            .filter(p -> p.getId() == id)
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not found"));
            
        return ResponseEntity.ok(prod);
    }

    @GetMapping("products")
    public List<Product> GetProducts(){
        return products;
    }
    
}
