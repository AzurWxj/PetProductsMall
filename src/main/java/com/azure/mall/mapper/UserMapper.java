package com.azure.mall.mapper;

import com.azure.mall.model.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUsersByUsername(String username);
}
