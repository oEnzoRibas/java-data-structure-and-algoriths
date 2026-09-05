package org.example;

import org.example.dtos.AddDTO;
import org.example.dtos.UpdateDTO;
import org.example.controllers.UserController;

import java.util.Scanner;

public class UserGraphicInterface {

    static UserController uc;
    static Scanner sc = new Scanner(System.in);


    public UserGraphicInterface(UserController uc){
        this.uc = uc;
    }

    public static int CRUDMenu(){

        System.out.println("""
                ______________________________
                
                Selecione uma opção
                
                1. - Listar Usuários
                2. - Adicionar Usuário
                3. - Atualizar Usuário
                4. - Remover Usuário
                0. - Exit
                
                ______________________________
                """);

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static void deleteAskUserInput(){
        System.out.println("Qual é o login do usuário a ser deletado?");
        String login = sc.nextLine();
        uc.delete(login);
    }

    public static void update(){
        System.out.println("Qual é o login do usuário a ser atualizado?");
        String login = sc.nextLine();

        UpdateDTO updateDTO = updateAskUserInput();

        uc.update(login, updateDTO);
    }

    private static UpdateDTO updateAskUserInput(){

        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        System.out.print("Digite o nome de usuário: ");
        String userName = sc.nextLine();

        return new UpdateDTO(email, userName);
    }

    public static AddDTO addDTOAskUserInput(){

        System.out.print("Digite o login: ");
        String login = sc.nextLine();

        System.out.print("Digite o email: ");
        String email = sc.nextLine();

        System.out.print("Digite o nome de usuário: ");
        String userName = sc.nextLine();

        return new AddDTO(login, email, userName);
    }

    public static void listUsers(){
        System.out.println("Lista de usuários:");
        uc.list();

    }
}
