package cn.j2go.febs.auth.web;


import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import org.apache.shenyu.client.springmvc.annotation.ShenyuSpringMvcClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RefreshScope
@RestController
@ShenyuSpringMvcClient(path = "/**")
public class LoginController {

    @GetMapping("/captcha")
    public void name(HttpServletResponse response) throws IOException {
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 20);
        captcha.write(response.getOutputStream());
    }

    @PostMapping("/login")
    public String login() {
        //        captcha.verify("1234");
        return "ok";
    }

}
