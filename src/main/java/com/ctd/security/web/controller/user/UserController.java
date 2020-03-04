package com.ctd.security.web.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author chentudong
 * @date 2020/3/2 1:46 下午
 * @since 1.0
 */
@RestController
@RequestMapping("user")
public class UserController
{
    /**
     * 根据id 查询用户
     *
     * @param id id
     * @return String
     */
    @GetMapping("findById")
    public String findById(String id)
    {
        return id;
    }
}
