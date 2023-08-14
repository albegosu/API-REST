package com.example.apirest.repositories;

import com.example.apirest.models.CUser;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<CUser, Integer> {
}
