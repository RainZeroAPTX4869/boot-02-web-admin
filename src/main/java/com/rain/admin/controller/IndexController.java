package com.rain.admin.controller;

import com.rain.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * 负责页面跳转
 *
 * @author RainZero
 * @date 2021/03/03 15:19
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession httpSession, Model model) {
        if (StringUtils.hasLength(user.getUsername()) && StringUtils.hasLength(user.getPwd())) {

//            登录成功的用户信息储存为session
            httpSession.setAttribute("loginUser", user);
            //       登录成功，重定向到main,防止表单重复提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }

    }

    /**
     * 跳转到main
     *
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
//        拦截器过滤器，判断是否登录
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "main";
        } else {
            model.addAttribute("msg", "请先登录");
            return "login";
        }

    }
}
