package Etapa1.C04;

import java.util.Scanner;

public class C04EX02 {
    public static void main(String[] args) {
        // Ficha do Empresário
        // Autor Enzo Rocha Leite Diniz Ribas
        Scanner teclado = new Scanner(System.in);
        String nome, cI, nomeEmpresa, cpf, tituloEleitor, cnh, salario;
        System.out.println("Digite seu NOME: ");
        nome = teclado.nextLine();
        System.out.println("Digite seu CPF: ");
        cpf = teclado.nextLine();
        System.out.println("Digite o número de Identidade: ");
        cI = teclado.nextLine();
        System.out.println("Digite o seu título de eleitor: ");
        tituloEleitor = teclado.nextLine();
        System.out.println("Digite sua Carteira Nacional de Habilitação: ");
        cnh = teclado.nextLine();
        System.out.println("Digite o NOME DA SUA EMPRESA: ");
        nomeEmpresa = teclado.nextLine();
        System.out.println("Digite seu SALÁRIO: ");
        salario = teclado.nextLine();
        System.out.printf("FICHA FUNCIONAL DE: %s\n\nDocumentos:\nCPF\t\t%s\n" ,nome,cpf);
        System.out.printf("C.I.\t\t\t%s\nTítulo de eleitort\t\t\t%s\n",cI,tituloEleitor);
        System.out.printf("Carteira de motorista\t\t\t%s\nTítulo de eleitor\t\t\t%s\n\n",cnh,tituloEleitor);
        System.out.printf("Empresa:\t\t\t%s\nSalário:\t\t\tR$%s",nomeEmpresa,salario);
        teclado.close();
    }
}
