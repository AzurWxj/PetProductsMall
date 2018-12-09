package com.azure.mall.mappers;

import com.azure.mall.models.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUsersByUsername(String username);
}
