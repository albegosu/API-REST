package com.example.apirest.services;

import com.example.apirest.models.CUser;
import com.example.apirest.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepository iUserRepository;
    public CUser getById(int id){
        return iUserRepository.findById(id).orElse(null);
    }
    public CUser saveUser(CUser user){
        return iUserRepository.save(user);
    }
    public String deleteUser(int userId){
        try{
            iUserRepository.deleteById(userId);
            return "Deleted" + userId;
        }
        catch(Exception Error){
            return "Not Deleted" + Error;
        }
    }
    public ArrayList<CUser> getUsers() { return (ArrayList<CUser>) iUserRepository.findAll(); }
    public CUser updateUser(CUser cUser, int id){
        CUser user = iUserRepository.findById(id).get();

        user.setName(cUser.getName());
        user.setLastname(cUser.getLastname());

        return iUserRepository.save(user);
    }
}
