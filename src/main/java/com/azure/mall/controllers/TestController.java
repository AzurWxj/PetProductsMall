package com.azure.mall.controllers;

import com.azure.mall.models.Admin;
import com.azure.mall.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public String index(Model model) {
        Admin admin = adminService.getAdminsByName("scott").get(0);
        model.addAttribute("admin", admin);
        return "test/showadmin";
    }
}
