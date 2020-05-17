package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Product;
import com.company.project.model.PurchaseOrder;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PurchaseOrderMapper extends Mapper<PurchaseOrder> {
    @Select("select * from purchase_order where uid =#{uid} ")
    @ResultMap("BaseResultMap")
    List<PurchaseOrder> getUserOrder(int uid);

    @Delete("delete from purchase_order where oid = #{oid}")
    int deleteOrder(int oid);
}