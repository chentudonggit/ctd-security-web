package com.ctd.security.web.controller.image;

import com.ctd.security.base.constant.ConstantCommon;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * 图片
 *
 * @author chentudong
 * @date 2020/3/3 11:59 上午
 * @since 1.0
 */
@Controller
public class ImageController
{
    @Autowired
    private DefaultKaptcha defaultKaptcha;

    /**
     * 图片验证码
     *
     * @param request  request
     * @param response response
     * @throws IOException IOException
     */
    @GetMapping("/code/image")
    public void imageCode(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String code = defaultKaptcha.createText();
        // 2. 字符串把它放到session中
        request.getSession().setAttribute(ConstantCommon.SESSION_KEY_IMAGE_CODE, code);
        // 3. 获取验证码图片
        // 4. 将验证码图片把它写出去
        BufferedImage image = defaultKaptcha.createImage(code);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
    }
}
