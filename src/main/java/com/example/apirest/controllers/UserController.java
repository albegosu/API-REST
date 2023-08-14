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

    @GetMapping() //All Users
    public ArrayList<CUser> getUsers(){
        return userService.getUsers();
    }
    @GetMapping(path="/{id}") //Specific User
    public CUser getById(@PathVariable int id){
        return userService.getById(id);
    }

    @PostMapping //Save new User
    public CUser saveUser(CUser user){
        return userService.saveUser(user);
    }

    @DeleteMapping(path="/{id}") //Delete one User
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }
    @PutMapping
    public CUser updateUser(CUser user, int id){
        return userService.updateUser(user, id);
    }
}
