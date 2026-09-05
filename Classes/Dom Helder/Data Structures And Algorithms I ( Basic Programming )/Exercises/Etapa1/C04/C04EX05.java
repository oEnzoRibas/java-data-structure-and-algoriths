package Etapa1.C04;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;
public class C04EX05 {
    // Ficha Funcial do Usuário com caixa de diálogo
    // Autor: Enzo Rocha Leite Diniz Ribas
    public static void main(String[] args) {
        String nome, cI, nomeEmpresa, cpf, tituloEleitor, cnh, salarioStr;
        Scanner arquivo = new Scanner(
                Objects.requireNonNull(C04EX05.class.getResourceAsStream("Etapa1/C04/C04EX05Arq.txt")));
        nome = arquivo.nextLine();
        cI = arquivo.nextLine();
        nomeEmpresa = arquivo.nextLine();
        cpf = arquivo.nextLine();
        tituloEleitor = arquivo.nextLine();
        cnh = arquivo.nextLine();
        salarioStr = arquivo.nextLine();
        double salario = Integer.parseInt(salarioStr);
        JOptionPane.showMessageDialog(null,
                "Nome: "+nome+"\n\nDocumentos:\nCPF: "+cpf+"\nC.I.: "+cI+"\nTítulo de Eleitor: "+tituloEleitor+"\nCarteira De Motorista: "+cnh+"\n\nEmpresa: "+nomeEmpresa+"\nSalário: R$"+salario,
                "Ficha Funcional",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }