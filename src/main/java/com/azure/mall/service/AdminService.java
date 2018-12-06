package com.azure.mall.service;

import com.azure.mall.mapper.AdminMapper;
import com.azure.mall.model.Admin;

import java.util.List;

//@Service
public class AdminService {
    private AdminMapper adminMapper;

    //@Autowired
    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public List<Admin> getAdminsByName(String adminName){
        return adminMapper.selectAdminsByName(adminName);
    }
}
