package com.Ahmad.SimpleSpringBootProject.repository;

import com.Ahmad.SimpleSpringBootProject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
