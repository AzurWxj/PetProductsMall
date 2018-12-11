package com.azure.mall.services;

import com.azure.mall.mappers.AdminMapper;
import com.azure.mall.models.Admin;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@ComponentScan
@Service
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
