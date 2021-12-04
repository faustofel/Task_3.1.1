package com.github.Task_311.controller;

import com.github.Task_311.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public String getInfo(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        return "user/userInfo";
    }

}
