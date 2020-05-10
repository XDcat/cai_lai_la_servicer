package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Cart;
import com.company.project.model.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CartMapper extends Mapper<Cart> {
    @Select("select product.* from product join (select pid from cart where uid =#{uid}) a on product.pid = a.pid")
    List<Product> getUserCart(int uid);

    @Delete("delete from cart where uid = #{uid} and pid = #{pid}")
    int deleteUserSomeCart(@Param("uid") int uid,@Param("pid") int pid);
}