package com.azure.mall.controllers;

import com.azure.mall.models.Admin;
import com.azure.mall.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import java.util.Arrays;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private ServletContext servletContext;

    public String show() {
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        if (applicationContext == null) {
            return ("ap is null");
        } else {
            return (Arrays.stream(applicationContext.getBeanDefinitionNames()).reduce("", (s, b) -> s + "<br/>" + b));
        }
    }

    @RequestMapping("/")
    public String index(Model model) {
        Admin admin = adminService.getAdminsByName("scott").get(0);
        model.addAttribute("admin", admin);
        model.addAttribute("beanmsg", show());
        return "test/showadmin";
    }
}
