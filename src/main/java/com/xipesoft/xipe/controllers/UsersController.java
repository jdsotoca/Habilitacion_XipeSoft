package com.xipesoft.xipe.controllers;


import com.xipesoft.xipe.dto.UsersModel;
import com.xipesoft.xipe.servicies.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.*;

@Controller

public class UsersController {

    @Autowired
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/register")
    public String getRegisterPage(Model dto){
        dto.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginPage(Model dto){
        dto.addAttribute("profileRequest", new UsersModel());
        return "login_page";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UsersModel usersModel){
        System.out.println("register request: "+ usersModel);
        UsersModel registeredUser = usersService.registerUser(usersModel.getProfile(), usersModel.getPassword(), usersModel.getEmail());
        return  registeredUser == null ? "error" : "redirect:/login";

    }



    @PostMapping("/login")
    public String login (@ModelAttribute UsersModel usersModel, Model dto){
        System.out.println("login request"+ usersModel);
        UsersModel authenticated =  usersService.authenticate(usersModel.getProfile(), usersModel.getPassword());
        if(authenticated != null){
            dto.addAttribute("userProfile", authenticated.getProfile());
            return "personal_page";

        }else{
            return "error_page";
        }


    }
}