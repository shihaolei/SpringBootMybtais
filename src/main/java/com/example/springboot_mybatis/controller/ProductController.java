package com.example.springboot_mybatis.controller;

import com.example.springboot_mybatis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/index")
    public String index(){
        return productService.index();
    }
}
