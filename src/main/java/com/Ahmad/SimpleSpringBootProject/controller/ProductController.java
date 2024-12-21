package com.Ahmad.SimpleSpringBootProject.controller;

import com.Ahmad.SimpleSpringBootProject.model.Product;
import com.Ahmad.SimpleSpringBootProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){
        return service.getProductById(proId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }
    @DeleteMapping("/products/{proId}")
    public void deleteProduct(@PathVariable int proId){
         service.deleteProduct(proId);
    }
}
