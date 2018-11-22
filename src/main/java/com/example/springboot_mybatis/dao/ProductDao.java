package com.example.springboot_mybatis.dao;

import com.example.springboot_mybatis.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface ProductDao {
    @Select("SELECT * FROM product")
   List<Product>  getAllProduct();

}
