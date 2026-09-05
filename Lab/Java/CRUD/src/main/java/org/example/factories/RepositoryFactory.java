package org.example.factories;

import org.example.repositories.UserRepositoryInterface;
import org.example.repositories.UsersRepository;

public class RepositoryFactory {
    public static UserRepositoryInterface createUserRepository(){
        return new UsersRepository();
    }
}
