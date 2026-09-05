package Course.Lists.L3.Exs.A.Classes;

import Course.Lists.L3.Exs.A.Exceptions.LimiteInsuficienteException;
import Course.Lists.L3.Exs.A.Exceptions.SaldoInsuficienteException;

public class Conta {
    private double saldo;
    private double limite = 200;
    private String nome, cpf;

    public Conta(String nome, String cpf, double saldo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSaldo(saldo);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) {
        this.saldo = (saldo < 0) ? 0 : saldo;
    }


    public double getLimite() { return limite; }
    public void setLimite(double valor){
        this.limite = valor;
    }

    public void deposita(double valor){
        setSaldo((valor < 0) ? saldo : saldo + valor);
    }

    public void saca(double valor) throws SaldoInsuficienteException, IllegalArgumentException,LimiteInsuficienteException {
        if (valor < 0) {throw new IllegalArgumentException("Valor invalido");
        }

        // saldo é suficiente para saque
         if(getSaldo() > valor){
             setSaldo(getSaldo() - valor);
         }
         else if (getLimite()+ getSaldo() >= valor){

             double rest = Math.abs(getSaldo() - valor);

             setSaldo(getSaldo()-valor);
             setLimite(getLimite()-rest);

             throw new SaldoInsuficienteException("Saque efetuado utilizando limite. "
                     + "\n Limite utilizado: " + (200 - this.limite) );
         }
         else{
             throw new LimiteInsuficienteException("Seu saldo é: " + this.saldo
                 + "\n Você tentou sacar: " + valor);
         }
    }

    public String toString(){
        return "Cliente: " + getNome() +
                "\nCPF: " + getCpf() +
                " \nSaldo: " + getSaldo()+
                " \nLimite: " + getLimite();
    }
}
