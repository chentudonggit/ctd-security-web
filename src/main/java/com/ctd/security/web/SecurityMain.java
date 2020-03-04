package com.ctd.security.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 *
 * @author chentudong
 * @date 2020/3/2 11:26 上午
 * @ ComponentScan("com.ctd.security.*")
 * 注意包路径："com.ctd.security.*"
 * 或者你可以把启动类移到上级目录：com.ctd.security  下
 * 例： com.ctd.security.SecurityMain 这样不需要这个注解
 * <p>
 * 原因是：不同模块包名区分：
 * com.ctd.security.web.**
 * com.ctd.security.code.**
 * com.ctd.security.base.**
 * <p>
 * 启动类在 com.ctd.security.web.SecurityMain
 * 不添加注解只会扫描在 com.ctd.security.web.** 下面的类
 * 因此在其他模块的配置类无法扫进项目容器管理，导致报错。
 *
 * <p>
 * 注意：
 * 因为启动类在 com.ctd.security.web 包下 必须使用下面的注解
 * @since 1.0
 */
@SpringBootApplication
@ComponentScan("com.ctd.security.*")
public class SecurityMain
{
    public static void main(String[] args)
    {
        SpringApplication.run(SecurityMain.class, args);
    }
}
