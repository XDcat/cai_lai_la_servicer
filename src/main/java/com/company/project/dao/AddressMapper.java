package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.Address;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AddressMapper extends Mapper<Address> {
    @Select("select * from address where uid = #{uid};")
    List<Address> getAddreddByUid(Integer uid);
}