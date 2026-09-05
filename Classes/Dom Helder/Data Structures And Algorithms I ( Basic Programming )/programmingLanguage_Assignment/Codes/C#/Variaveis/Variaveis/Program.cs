using System;

namespace Classes_03
{
    public class Switch

    // Exemplo de um Switch Case em C#.
    // @Autores: Enzo R. L. D. Ribas && Ana Luiza 
    {
        public static void Main(string[] args)
        {

            // Declaração de Variáveis sem Tipo
            var x = "oi";
            var y = 1;
            var z = 2.33;

            //Declaração de Variáveis Numericas Inteiras
            int numInt = -1; // Inteiro de 32 bits com sinal
            uint numUInt = 2; // Inteiro de 32 bits sem sinal


            //Declaração de Variáveis Numericas Reais
            double numDou = 2.1;
            float numFloat = 3.23f; // Necessário colocar um "f" no final do número
            decimal numDec = 4.534m; // Necessário colocar um "m" no final do número

            //Declaração de variáveis De Caractere
            char numChar = '6';
  
            //Declaração de Variáveis Booleanas
            bool teste = true;

            //Declaração de Variáveis de Referência
            string numStr = "Numero 6"; // Sequencia de Caracteres Unicode
            object numObj = 6; // Tipo de Referência que pode armazenar qualquer tipo de valor

        }
    }
}

