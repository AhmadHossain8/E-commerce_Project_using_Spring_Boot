package com.Ahmad.SimpleSpringBootProject.service;

import com.Ahmad.SimpleSpringBootProject.model.Product;
import com.Ahmad.SimpleSpringBootProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>(Arrays.asList(
//            new Product(101,"Pen",1000),
//            new Product(102,"Beg",2000),
//            new Product(103,"Pencil",500)
//
//    ));
    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int proId) {
        return repo.findById(proId).orElse(new Product());
    }
    public void addProduct( Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(int proId) {
        repo.deleteById(proId);
    }
}
