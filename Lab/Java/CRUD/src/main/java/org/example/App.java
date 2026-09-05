package org.example;

import org.example.controllers.UserController;
import org.example.factories.RepositoryFactory;
import org.example.repositories.UserRepositoryInterface;
import org.example.services.AddService;
import org.example.services.DeleteService;
import org.example.services.ListService;
import org.example.services.UpdateService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner kIn = new Scanner(System.in);

        UserRepositoryInterface userRepository = RepositoryFactory.createUserRepository();

        AddService addService = new AddService(userRepository);
        ListService listService = new ListService(userRepository);
        UpdateService updateService = new UpdateService(userRepository);
        DeleteService deleteService = new DeleteService(userRepository);

        UserController uc = new UserController(addService, listService, updateService, deleteService);
        UserGraphicInterface ugi = new UserGraphicInterface(uc);



        while (true){
            switch (ugi.CRUDMenu()){
                        case 1 -> {
                            ugi.listUsers();
                        }
                        case 2 -> {
                            uc.add(ugi.addDTOAskUserInput());
                        }
                        case 3 -> {
                            ugi.update();
                        }
                        case 4 -> {
                            ugi.deleteAskUserInput();
                        }
                        case 0 ->{
                            return;
                        }
                    }
            }

        }

    }
