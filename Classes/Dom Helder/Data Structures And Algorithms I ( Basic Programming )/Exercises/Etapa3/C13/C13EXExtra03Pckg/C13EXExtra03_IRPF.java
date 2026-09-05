package Etapa3.C13.C13EXExtra03Pckg;

public class C13EXExtra03_IRPF {

    /*
        Autor: Enzo Rocha Leite Diniz Ribas
        */

    private double salario;
    private int qntDep;
    private static double salarioDepAbt;

    public C13EXExtra03_IRPF(){
    }

    public C13EXExtra03_IRPF(double salario, int qntDep){
        this.salario = salario;
        this.qntDep = qntDep;
    }

    public static double imposto(double salario, int qntDep){

        salarioDepAbt = salario-qntDep*150;

        if (salarioDepAbt < 1000){
            return 0;
        }else if (salarioDepAbt < 5000){
            return salarioDepAbt * (0.1);
        }else if (salarioDepAbt < 10000){
            return salarioDepAbt * (0.15);
        }else {
            return salarioDepAbt * (0.2);
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getQntDep() {
        return qntDep;
    }

    public void setQntDep(int qntDep) {
        this.qntDep = qntDep;
    }
}
