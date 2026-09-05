package Etapa1.C06;

import java.util.Scanner;

public class C06EX15 {
    public static void main(String[] args) {

        // Calcular conta de plano de assinatura de TV
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        int codPkg, dias;
        double imposto = 5, conta, vlrFixo = 0, vlrPPP = 0, gastoPPP, srvXtra, impostoVlrFixo, impostoPPP, impostoXtra, impostoTotal;

        System.out.println("""
                
                Pacote         Código
                
                Basic  --------   1
                Advanced  -----   2
                Premium  ------   3
                
                Informe o código do seu pacote:\s""");
        codPkg = teclado.nextInt();

        //Testar código do pacote e atribuir o valor fixo referente
        if (codPkg == 1){
            vlrFixo = 65;
            vlrPPP = 1.20;
        } else
            if (codPkg == 2){
            vlrFixo = 104;
            vlrPPP = 2.10;
        } else
            if (codPkg == 3){
            vlrFixo = 137;
            vlrPPP = 0;
            } else System.out.println("Código Inválido. Por Favor, insira um código válido");

        System.out.println("Informe a quantidade de dias de consumo dos canais pay-per-view: ");
        dias = teclado.nextInt();

        // Estabelecer Limite de R$65 no pacote 1
        gastoPPP = vlrPPP*dias;
        if (codPkg == 1 && gastoPPP > 65) {
            gastoPPP = 65;
        }

        
        //le o valor de servicos extras
        System.out.println("Informe o valor gasto em serviços extras: ");
        srvXtra = teclado.nextDouble();

        //le a cidade
        teclado.nextLine();
        System.out.println("Informe sua Cidade: ");
        String cidade = teclado.nextLine();


        //atribuir valor do imposto baseado na cidade



        if (cidade.equalsIgnoreCase("Belo Horizonte") || cidade.equalsIgnoreCase("BH") || cidade.equalsIgnoreCase("Belohorizonte")){
            imposto = 0;
        } else if (cidade.equalsIgnoreCase("São Paulo") || cidade.equalsIgnoreCase("SP") || cidade.equalsIgnoreCase("sãopaulo") || cidade.equalsIgnoreCase("saopaulo") || cidade.equalsIgnoreCase("sao paulo")) {
            imposto =((double) 1 / 100);
        } else if (cidade.equalsIgnoreCase("Rio De Janeiro") || cidade.equalsIgnoreCase("RJ") || cidade.equalsIgnoreCase("RioDeJaneiro")){
                imposto = (1.5 / 100);
        }

        //Calcula o Imposto
        impostoVlrFixo = (imposto * vlrFixo); 
        impostoPPP = imposto * vlrPPP;
        impostoXtra = imposto * srvXtra;
        impostoTotal = impostoPPP+impostoXtra+impostoVlrFixo;
        
        conta = vlrFixo+gastoPPP+srvXtra+impostoTotal;
        System.out.printf("""
                Valor total gasto com PPP = %.1f

                Valor total gasto com Serviços Extras = %.1f\s

                Valor total gasto com Imposto Sobre Valor Fixo = %.1f\s
                Valor total gasto com Imposto Sobre PPP = %.1f\s
                Valor total gasto com Imposto Sobre Serviços Extras = %.1f\s

                Valor total gasto com Impostos = %.1f\s

                Valor Total da Conta: %.2f\s""",gastoPPP,srvXtra,impostoVlrFixo,impostoPPP,impostoXtra,impostoTotal,conta);
    }
}
