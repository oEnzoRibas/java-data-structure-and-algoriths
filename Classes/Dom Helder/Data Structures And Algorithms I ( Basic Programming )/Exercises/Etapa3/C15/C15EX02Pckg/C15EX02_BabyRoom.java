package Etapa3.C15.C15EX02Pckg;

import Etapa3.C15.C15EX01Pckg.C15EX01_Room;

public class C15EX02_BabyRoom extends C15EX01_Room {

        /*
        Criação de uma classe por herança
        Autor: Enzo Rocha Leite Diniz Ribas
         */

    private int qntFraldas, qntToys;
    public C15EX02_BabyRoom(String nome, String cor, String piso, int qntPortas, int qntJanelas, boolean arCondicionado, boolean varanda, int qntToys, int qntFraldas) {
        super(nome, cor, piso, qntPortas, qntJanelas, arCondicionado, varanda);
        this.qntFraldas = qntFraldas;
        this.qntToys = qntToys;
    }

    public C15EX02_BabyRoom(){
    }

    public void BabyroomInfo(){
        System.out.printf("""
                
                Nome do quarto: %s
                Cor do quarto: %s
                Tipo de Piso: %s
                Quantidade de Portas: %d
                Quantidade de Janelas: %d
                ArCondicionado: %b
                Varanda: %b
                Quantidade de Brinquedos: %d
                Quantidade de Fraldas: %d
                
                Precisa comprar fraldas? : %s
                Precisa comprar brinquedos? : %s
               
                """,super.getNome(),super.getCor(),super.getPiso(),super.getQntPortas(),super.getQntJanelas(),super.isArCondicionado(),super.isVaranda(),qntToys,qntFraldas,poucasFraldas(),poucosToys());
    }

    public String poucosToys (){
        if (qntToys < 10) {
            return "Sim";
        }else {
            return "Não";
        }
    }

    public String poucasFraldas (){
        if (qntFraldas < 5) {
            return "Sim";
        }else {
            return "Não";
        }
    }

    public int getQntFraldas() {
        return qntFraldas;
    }

    public void setQntFraldas(int qntFraldas) {
        this.qntFraldas = qntFraldas;
    }

    public int getQntToys() {
        return qntToys;
    }

    public void setQntToys(int qntToys) {
        this.qntToys = qntToys;
    }
}
