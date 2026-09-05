package ProvaFinal.QUESTAOC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MATRICULA_C {
    /*
    Autor: Enzo Rocha Leite Diniz Ribas
    Matricula *******
    QUESTÃO C CLASSE PRINCIPAL
     */

    static List<Integer> classArrList = new ArrayList<>();
    static List<String> nomesAlunoArrList = new ArrayList<>();
    static List<String> nomesEscolaArrList = new ArrayList<>();

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nomeCad;
        int clasfCad;
        String nomeEscolaCad;

        do {


            System.out.println("Bem vindo ao registro de alunos do campeonato de computação:");

            System.out.println("""
                    Informe o Nome do aluno:
                    Digite 'X' para cancelar.""");


            nomeCad = teclado.nextLine();
            if (nomeCad.equalsIgnoreCase("X")) {
                break;
            }
            System.out.println("Informe a escola do aluno:");
            nomeEscolaCad = teclado.nextLine();
            nomesEscolaArrList.add(nomeEscolaCad);

            nomesAlunoArrList.add(String.valueOf(formatador(nomeCad, nomeEscolaCad)));

            System.out.println("Informe a classificação do aluno:");
            clasfCad = teclado.nextInt();
            teclado.nextLine();
            classArrList.add(clasfCad);

        } while (!(nomeCad.equalsIgnoreCase("X")));

        // remoção dos alunos desclassificados
        System.out.println("Informe o nome da escola que TODOS os alunos foram DESCLASSIFICADOS: ");
        String escolaDesclas = teclado.nextLine();

        // testa se teve alunos dessa escola na lista
        if (nomesEscolaArrList.contains(escolaDesclas)) {

            while (nomesEscolaArrList.contains(escolaDesclas)) {
                // identifica o indicie em que a escola está na lista
                int index = (nomesEscolaArrList.indexOf(escolaDesclas));
                nomesEscolaArrList.remove(index);
                nomesAlunoArrList.remove(index);
                classArrList.remove(index);

            }

        }

        for (int aux = 0; aux < classArrList.size() - 1; aux++) {
            for (int x = 0; x < classArrList.size() - 1; x++) {
                // ordenação

                int tempClass;
                String tempNomeAluno, tempNomeEscola;

                if (classArrList.get(x) > (classArrList.get(x + 1))) {
                    tempClass = classArrList.get(x);
                    classArrList.set(x, classArrList.get(x + 1));
                    classArrList.set(x + 1, tempClass);

                    tempNomeAluno = nomesAlunoArrList.get(x);
                    nomesAlunoArrList.set(x, nomesAlunoArrList.get(x + 1));
                    nomesAlunoArrList.set(x + 1, tempNomeAluno);

                    tempNomeEscola = nomesEscolaArrList.get(x);
                    nomesEscolaArrList.set(x, nomesEscolaArrList.get(x + 1));
                    nomesEscolaArrList.set(x + 1, tempNomeEscola);
                }
            }
        }

        System.out.printf("""
                Classificação Final:
                1 - %d %s
                2 - %d %s
                3 - %d %s""", classArrList.get(0),
                nomesAlunoArrList.get(0),
                classArrList.get(1),
                nomesAlunoArrList.get(1),
                classArrList.get(2),
                nomesAlunoArrList.get(2));

    }

    public static StringBuilder formatador(String nomeAluno, String nomeEscola) {
        StringBuilder formatado = new StringBuilder();

        formatado.append(nomeAluno.toUpperCase()).append(" (escola: ").append(nomeEscola.toUpperCase()).append(")");

        return formatado;

    }
}
