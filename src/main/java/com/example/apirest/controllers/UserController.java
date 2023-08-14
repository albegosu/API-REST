package com.example.apirest.controllers;

import com.example.apirest.models.CUser;
import com.example.apirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<CUser> getUsers(){
        return userService.getUsers();
    }
    @DeleteMapping(path="/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

}
