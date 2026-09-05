package org.example.controllers;

import org.example.dtos.AddDTO;
import org.example.dtos.UpdateDTO;
import org.example.services.AddService;
import org.example.services.DeleteService;
import org.example.services.ListService;
import org.example.services.UpdateService;

public class UserController {

    AddService addService;
    ListService listService ;
    UpdateService updateService;
    DeleteService deleteService ;

    public UserController(AddService addService, ListService listService, UpdateService updateService, DeleteService deleteService){
        this.addService = addService;
        this.listService = listService;
        this.updateService = updateService;
        this.deleteService = deleteService;
    }

    public void add(String login, String email, String username){
        addService.add(new AddDTO(login,email,username));
    }

    public void add(AddDTO addDTO){
        addService.add(addDTO);
    }

    public void list(){
        listService.list();
    }

    public void delete(String login){
        deleteService.deleteByLogin(login);
    }

    public void update(String login, UpdateDTO updateDTO) {
        updateService.update(login, updateDTO);
    }
}
