package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Product;
import com.company.project.model.ProductClass;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductClassMapper extends Mapper<ProductClass> {
    @Select("select * from product where pcid = #{pcid}")
    List<Product> getProductByClass(int pcid);
}