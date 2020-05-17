package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper extends Mapper<Product> {
    @Select("select * from product " +
            "where (title like concat('%', #{v}, '%') or subTitle like concat('%', #{v}, '%'))" +
            "and currentPrice <= #{max} and currentPrice >= #{min}")
    List<Product> filterProduct(@Param("v") String v, @Param("min") Integer minPrice, @Param("max") Integer maxPrice);
}