package com.bychat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 聊天相关接口
 * @author tan_zhipeng
 * @date 2020/4/30
 * @time 9:58
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private static final Logger logger = LoggerFactory.getLogger(ChatController.class);

    /**
     * 登录页面inde
     * @return
     */
    @RequestMapping("/index")
    public String loginPage()
    {
        return "/index/index";
    }
}
