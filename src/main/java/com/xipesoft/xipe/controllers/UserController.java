package com.xipesoft.xipe.controllers;

import com.xipesoft.xipe.entities.Users;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController{
    @RequestMapping(value="/user/{id}")
    public Users getUsers(@PathVariable long id){
        Users users = new Users();
        users.setId(1);
        users.setEmail("juan@gmail.com");
        users.setTask("");
        users.setProfile("");
        users.setPassword("");
        return users;
    }
    @RequestMapping(value="/user1")
    public Users modifyUsers(){
        Users users = new Users();
        users.setEmail("juan@gmail.com");
        users.setTask("");
        users.setProfile("");
        users.setPassword("");
        return users;
    }
    @RequestMapping(value="/user2")
    public Users deleteUsers(){
        Users users = new Users();
        users.setEmail("juan@gmail.com");
        users.setTask("");
        users.setProfile("");
        users.setPassword("");
        return users;
    }
}
