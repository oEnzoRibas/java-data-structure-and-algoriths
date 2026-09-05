package org.example.services;

import org.example.repositories.UserRepositoryInterface;
import org.example.repositories.UsersRepository;

public class ListService {

    private UserRepositoryInterface usersRepository;

    public ListService(UserRepositoryInterface usersRepository){
        this.usersRepository = usersRepository;
    }

    public void list(){
        usersRepository.list();
    }
}
