package org.example.services;

import org.example.repositories.UserRepositoryInterface;
import org.example.repositories.UsersRepository;

public class DeleteService {
    private UserRepositoryInterface usersRepository;

    public DeleteService(UserRepositoryInterface usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void DeleteService(UserRepositoryInterface usersRepository){
        this.usersRepository = usersRepository;
    }

    public void deleteByLogin(String login){
        boolean deleted = usersRepository.deleteByLogin(login);
        if (deleted) {
            System.out.println("Usuário com login " + login + " deletado com sucesso!");
        } else {
            System.out.println("Usuário com login " + login + " não encontrado.");
        }
    }

}
