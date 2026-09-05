package Etapa3.C13.C13EXExtra03Pckg;

import java.util.ArrayList;
import java.util.List;

public class C13EXExtra03_IRPFFicha extends C13EXExtra03_IRPF{

    /*
    Autor: Enzo Rocha Leite Diniz Ribas
     */

    private String nome;

    private static List<String> nomesArrList = new ArrayList<>();
    private static List<Double> impostoArrList = new ArrayList<>();

    private static List<Double> salarioArrList = new ArrayList<>();

    public C13EXExtra03_IRPFFicha() {
    }

    public C13EXExtra03_IRPFFicha(double salario, int qntDep, String nome) {
        super(salario, qntDep);
        this.nome = nome;
    }

    public static void addFicha(String nome, double salario, int qntDep){
            nomesArrList.add(nome);
            salarioArrList.add(salario);
            impostoArrList.add(imposto(salario,qntDep));
    }

    public static void printFichaAlfBt(){

        String tempNome;
        double tempImpst, tempSal;
        for (int aux = 0; aux < nomesArrList.size()-1; aux++)
            for (int x = 0; x < nomesArrList.size()-1; x++)
                // ordena alfabeticamente
                if (nomesArrList.get(x).compareToIgnoreCase(nomesArrList.get(x+1)) > 0) {
                    tempNome = nomesArrList.get(x);
                    nomesArrList.set(x,nomesArrList.get(x+1));
                    nomesArrList.set(x+1,tempNome);

                    tempImpst = impostoArrList.get(x);
                    impostoArrList.set(x,impostoArrList.get(x+1));
                    impostoArrList.set(x+1,tempImpst);

                    tempSal = salarioArrList.get(x);
                    salarioArrList.set(x,salarioArrList.get(x+1));
                    salarioArrList.set(x+1,tempSal);
                }


        for (int i = 0; i < nomesArrList.size(); i++){
            System.out.printf("""
                            %d. Nome: %s
                                Salário: %f
                                IRPF: %f                                
                            """,i+1,nomesArrList.get(i),salarioArrList.get(i),impostoArrList.get(i));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
