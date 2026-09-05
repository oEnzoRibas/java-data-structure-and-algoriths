package org.example.services;

import org.example.dtos.UpdateDTO;
import org.example.repositories.UserRepositoryInterface;

public class UpdateService {
    private UserRepositoryInterface usersRepository;

    public UpdateService(UserRepositoryInterface usersRepository){
        this.usersRepository = usersRepository;
    }

    public void update(String login, UpdateDTO updateDTO){
        usersRepository.update(login,updateDTO);
    }
}
