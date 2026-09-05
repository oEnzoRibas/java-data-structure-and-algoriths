package org.example.repositories;

import org.example.dtos.UpdateDTO;
import org.example.models.User;

public interface UserRepositoryInterface {
    void add(User u, String id);
    User fetch(String id);
    boolean update(String login, UpdateDTO updateDTO);
    void delete(String id);
    void list();
    boolean deleteByLogin(String login);
}
