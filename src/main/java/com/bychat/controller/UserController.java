package com.bychat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 用户相关接口
 * @author tan_zhipeng
 * @date 2020/4/30
 * @time 9:48
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/login")
    public String loginPage()
    {
    return "/login/login";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping("/register")
    public String register()
    {
        return "/login/register";
    }

    /**
     * 重置密码页面
     * @return
     */
    @RequestMapping("/resetpwd")
    public String resetpwd()
    {
        return "/login/reset-password";
    }
}
