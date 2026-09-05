package Etapa2.C08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C08EX10 {
    public static void main(String[] args) {

        // Ler Tabela de Insumo e calcular gastos a partir de um arquivo externo
        // Autor: Enzo Rocha Leite Diniz Ribas

        Scanner teclado = new Scanner(System.in);

        File file = new File("src/Etapa2/C08/C08EX10 Arquivo"); // LÊ O ARQUIVO

        try { // tenta executar a leitura do arquivo e executar o programa

            Scanner arquivo = new Scanner(file); // BUSCA INFORMAÇÕES NO ARQUIVO

            int rep, quantidade;
            String insumo, maiorCustoParStr = null;
            double maiorCustoPar = 0, custoTotal = 0, mediaCustosPar, custoParcial, precoUn;

            System.out.println("Informe quantos tipos insumos serão consumidos no projeto: ");
            rep = teclado.nextInt();

            for (int i = 1; i <= rep; i++) {

                insumo = arquivo.nextLine();
                quantidade = arquivo.nextInt();
                precoUn = arquivo.nextDouble();
                arquivo.nextLine();

                custoParcial = precoUn*quantidade; // Calcula o preço parcial do insumo atual
                custoTotal += custoParcial; // Soma o valor do custo parcial a soma total

                if ( i == 1 || custoParcial > maiorCustoPar ){
                    maiorCustoPar = custoParcial;
                    maiorCustoParStr = insumo;
                }

                System.out.println("\nInsumo: " + insumo + ", Quantidade: " + quantidade + ", Preço unitário: R$" + precoUn + ", Preço Parcial: R$" + custoParcial);

            }
            
            mediaCustosPar = custoTotal / rep;
            
            System.out.println("\nCusto total do projeto: R$"+custoTotal+
                    "\nMédia dos Custos Parciais: "+mediaCustosPar+
                    "\nInsumo com maior custo Parcial: "+maiorCustoParStr);
            arquivo.close();
            
        }catch (FileNotFoundException e) { // Caso a leitura do programa não seja possivel aborta o código e insere mensagem de erro

            System.out.println("\nArquivo não encontrado: " + e.getMessage());
    }
}
}
