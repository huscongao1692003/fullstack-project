package com.example.startup.controller;


import com.example.startup.model.Product;
import com.example.startup.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(path = "api/v1/products")
    public List<Product> showProduct(){
        List<Product> productList=productRepository.findAll();
        return productList;
    }
}
