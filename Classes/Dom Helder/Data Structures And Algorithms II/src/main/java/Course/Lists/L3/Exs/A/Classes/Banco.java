package Course.Lists.L3.Exs.A.Classes;

import Course.Lists.L3.Exs.A.Exceptions.LimiteInsuficienteException;
import Course.Lists.L3.Exs.A.Exceptions.SaldoInsuficienteException;

import javax.swing.*;

public class Banco {
    public static void main(String[] args) {
        String nome = typeString("Digite o nome do cliente: ");
        String cpf = typeString("Digite o CPF do cliente: ");

        double saldo = typeDouble("Digite o saldo inicial do cliente: ");

        Conta c = new Conta(nome, cpf, saldo);

        double deposito = typeDouble("Digite o valor do deposito: ");
        c.deposita(deposito);

        double saque;
        saque = typeDouble("Digite o valor do saque: ");

        try {
            c.saca(saque);
        } catch (IllegalArgumentException | LimiteInsuficienteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() +
                    "\nSaque não realizado.");
        } catch (SaldoInsuficienteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        JOptionPane.showMessageDialog(null,c.toString());
    }

    private static double typeDouble(String prompt) {
        while (true) {

            String userInput = JOptionPane.showInputDialog(null, prompt);

            if (userInput == null || userInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada cancelada ou vazia!");
                continue;
            }

            try {
                return Double.parseDouble(userInput);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido!");
            }
        }
    }


    private static String typeString(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }
}
