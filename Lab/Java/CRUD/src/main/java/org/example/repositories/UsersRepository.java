package org.example.repositories;

import org.example.dtos.UpdateDTO;
import org.example.models.User;

import java.util.HashMap;
import java.util.Map;

public class UsersRepository implements UserRepositoryInterface {

    private final HashMap<String, User> usersMap = new HashMap<>();

    @Override
    public void add(User u, String id) {
        usersMap.put(u.getId(), u);
    }

    @Override
    public void delete(String id) {
        usersMap.remove(id);
    }

    public boolean update(String login, UpdateDTO updateDTO) {
        String keyToUpdate = null;
        for (Map.Entry<String, User> entry : usersMap.entrySet()) {
            if (entry.getValue().getLogin().equals(login)) {
                keyToUpdate = entry.getKey();
                break;
            }
        }
        if (keyToUpdate != null) {
            usersMap.get(keyToUpdate).update(updateDTO);
        }
        return false;
    }

    @Override
    public User fetch(String id) {
        for (User u : usersMap.values()){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }

    @Override
    public void list() {
        int i = 0;
        for(User u : usersMap.values()){
            System.out.println();
            System.out.println(++i+ " - " + u.toString());
        }
    }

    public boolean deleteByLogin(String login) {
        String keyToRemove = null;
        for (Map.Entry<String, User> entry : usersMap.entrySet()) {
            if (entry.getValue().getLogin().equals(login)) {
                keyToRemove = entry.getKey();
                return true;
            }
        }
        if (keyToRemove != null) {
            usersMap.remove(keyToRemove);
        }
        return false;
    }


}
