package com.example.springboot_mybatis.pojo;


import lombok.ToString;

@ToString
public class Product {
    private int id;
    private String name;
    public Product(int id,String name){
      this.id = id;
      this.name = name;
    }
}
