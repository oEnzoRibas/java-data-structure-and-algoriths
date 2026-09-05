using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Classes_01
{

/*
    Autor: Enzo Rocha Leite Diniz Ribas
    Programa principal
*/

    public class Program // classe que representa o programa inicial
    {
        public static void Main(string[] args){ // Main class, it runs the program.

            Console.WriteLine("Informe o lado: ");
                int lado = int.Parse(Console.ReadLine() ?? "0");
            


            // Instanciação da classe caixa, com a criação do objeto 'cx' que retorna o método caixa
            Caixa cx; // Criação do objeto
            cx = new Caixa(lado,1); // Método Construtor (Metodo que inicia junto a função)
            
            var area = cx.area(); // Utilizando a funcao que calcula area



            Console.WriteLine("Area é igual a : "+ area+"" +
                "\r\nLado = " + lado);

        }
    }
}