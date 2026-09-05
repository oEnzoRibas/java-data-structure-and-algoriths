using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes_01

/*
    Autor: Enzo Rocha Leite Diniz Ribas
    Criando Objeto (Classe) Caixa
*/

{
    public class Caixa // nome da classe
    {

        // Atributos da classe
        double lado;
        int vertice;

        // Métodos 

        // instaciando o método construtor construtor (Caracteristicas do OBJETO)
        public Caixa (double lado,int vertice){
            this.lado = lado;           // Referenciando o lado da função para diferenciar do lado da classe
            this.vertice = vertice;
        }

        public Caixa(int lado)
        {
            this.lado = lado;
        }

        double return_lado(){ // tipo double é referente ao retorno
            return lado;
        }

        public double area (){ // Utiliza as variaveis para calcular a area
            return lado * lado;
        }

        double volume(){
            return lado * lado * lado;
        }

        double[] somaAreas(int qntCaixas){
            double [] vet = new double [2] ;

            vet [0] = lado * lado * qntCaixas;
            vet [1] = vertice;

            return vet;

        }
    
    }
}