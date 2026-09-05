package Etapa3.C15.C15EX01Pckg;

public class C15EX01_Room {

    /*
    Criação de uma Classe PAI
    Autor: Enzo Rocha Leite Diniz Ribas
    */

    private String nome,cor,piso;
    private int qntPortas, qntJanelas;

    private boolean arCondicionado,varanda;

    public C15EX01_Room(String nome, String cor, String piso, int qntPortas, int qntJanelas, boolean arCondicionado, boolean varanda){
        this.nome = nome;
        this.cor = cor;
        this.piso = piso;
        this.qntPortas = qntPortas;
        this.qntJanelas = qntJanelas;
        this.arCondicionado = arCondicionado;
        this.varanda = varanda;
    }

    public C15EX01_Room() {
    }

    public void roomInfo(){
        System.out.printf("""
                
                Nome do quarto: %s
                Cor do quarto: %s
                Tipo de Piso: %s
                Quantidade de Portas: %d
                Quantidade de Janelas: %d
                ArCondicionado: %b
                Varanda: %b
               
                """,nome,cor,piso,qntPortas,qntJanelas,arCondicionado,varanda);
    }

    public boolean premium(boolean arCondicionado, boolean varanda){
        return arCondicionado && varanda;
    }

    public boolean premium(){
        return arCondicionado && varanda;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isVaranda() {
        return varanda;
    }

    public void setVaranda(boolean varanda) {
        this.varanda = varanda;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getQntJanelas() {
        return qntJanelas;
    }

    public void setQntJanelas(int qntJanelas) {
        this.qntJanelas = qntJanelas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        this.qntPortas = qntPortas;
    }
}
