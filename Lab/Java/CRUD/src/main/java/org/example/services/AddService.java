package org.example.services;

import org.example.dtos.AddDTO;
import org.example.models.User;
import org.example.repositories.UserRepositoryInterface;

import java.util.UUID;

public class AddService {

    private UserRepositoryInterface usersRepository;

    public AddService(UserRepositoryInterface usersRepository){
        this.usersRepository = usersRepository;
    }
    public void add(AddDTO data){
        User u = new User(
                data.getLogin(),
                data.getEmail(),
                data.getUserName(),
                UUID.randomUUID().toString());
        usersRepository.add(u, u.getId());
    }
}
