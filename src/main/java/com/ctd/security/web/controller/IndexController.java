package com.ctd.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IndexController
 *
 * @author chentudong
 * @date 2020/3/2 11:40 上午
 * @since 1.0
 * <p>
 * 需要跳转页面，不能使用 @RestController,
 * 需要返回 json 在方法上加 @ResponseBody
 */
@Controller
public class IndexController
{
    /**
     * 访问首页 html
     *
     * @return String
     */
    @GetMapping({"", "/", "index"})
    public String index()
    {
        return "index";
    }

    /**
     * 登录页面
     *
     * @return String
     */
    @GetMapping("/login/page")
    public String login()
    {
        return "login";
    }
}
