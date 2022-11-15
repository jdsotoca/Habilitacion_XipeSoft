package com.xipesoft.xipe.controllers;

import com.xipesoft.xipe.dto.UsersDto;
import com.xipesoft.xipe.entities.Task;
import com.xipesoft.xipe.entities.Users;
import com.xipesoft.xipe.servicies.UserServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController{

    @Autowired
    UserServicies userServicies;
/*
    public UserController(UserServicies userServicies){

        this.userServicies = userServicies;
    }*/
    @GetMapping("/user")
    public ResponseEntity<List<Users>> listaUsers(){
        List<Users> users = userServicies.verUsers();
        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
    }
    @PostMapping("/crearuser")
    private void crearUser(@RequestBody Users users){
        userServicies.crearyActualizarUser(users);
    }
    @DeleteMapping("/user/{id}")
    private void eliminarUser(@PathVariable("id") Long id){
        userServicies.eliminarUser(id);
    }
    @PutMapping("/editaruser")
    private void editarUser(@RequestBody Users users){
        userServicies.crearyActualizarUser(users);
    }

/*
    @PostMapping("user/crear")
    public ResponseEntity<Users> crearUser(@RequestBody UsersDto user){
        Users response = userServicies.crearUser(user);
        if (response == null){
            return ResponseEntity.ok().body(response);
        }
        return ResponseEntity.ok().body(response);


    }
    @RequestMapping("/user")
    public String verUsers(Model modelo){
        List<Users> usersList = userServicies.verUsers();
        modelo.addAttribute("userList",usersList);
        return "index";
    }

/*
    @RequestMapping(value="/user/{id}")
    public Users getUsers(@PathVariable long id){
        Users users = new Users();
        users.setId(1);
        users.setEmail("juan@gmail.com");
        //users.setTasks(List<Task> tasks);
        //users.setProfile("");
        return users;
    }
    /*
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
    }*/
}
