package TrabalhoCSharp;

import javax.swing.*;

public class JOpPane {
    public static void main(String[] args) {


        // Exemplo de janela de diálogo em Java.
        // @Autores: Enzo R. L. D. Ribas && Ana Luiza

        Object[] resp = {"Sim", "Não"};
        int resposta;

        JOptionPane.showMessageDialog(null, "Olá, Mundo!");

        resposta = JOptionPane.showOptionDialog(null,
                "Você Gostaria de Continuar?",
                "Pergunta",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, resp, resp[0]);

        switch (resposta) {
            case 1 -> System.out.println("O Usuário escolheu Não");
            case 0 -> System.out.println("O Usuário escolheu Sim");
        }

    }
}