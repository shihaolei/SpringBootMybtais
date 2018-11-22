package com.example.springboot_mybatis.service;

import com.example.springboot_mybatis.dao.ProductDao;
import com.example.springboot_mybatis.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;
    public String index(){
        List<Product> product = productDao.getAllProduct();
        System.out.println(product);
        return "phone";
    }
}
