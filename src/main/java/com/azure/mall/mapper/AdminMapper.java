package com.azure.mall.mapper;

import com.azure.mall.model.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Repository
public interface AdminMapper {
    @Select("select * from admins where admin=#{name}")
    List<Admin> selectAdminsByName(@Param("name") String adminName);
}
