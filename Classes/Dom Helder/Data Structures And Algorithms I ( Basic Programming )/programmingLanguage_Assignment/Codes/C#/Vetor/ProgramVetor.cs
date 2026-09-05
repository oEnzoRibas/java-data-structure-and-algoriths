using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


public class Vetor
{
    // Exemplo de um Vetor em C#.
    // @Autores: Enzo R. L. D. Ribas && Ana Luiza 

    public static void Main()
    {
        int qnt;

        Console.WriteLine("Informe a quantidade de dados a serem guardados: ");
        qnt = int.Parse(Console.ReadLine());

        int[] vet = new int[qnt];

        for (int aux = 0; aux < vet.Length; aux++)
        {
            Console.WriteLine("Informe o valor a ser guardado: ");
            vet[aux] = int.Parse(Console.ReadLine());
        }

        Console.WriteLine("Valores guardados: ");
        for (int aux = 0; aux < vet.Length; aux++)
        {
            Console.Write(vet[aux]+ " ");
        }

        Console.WriteLine("\r\n Valores guardados ao quadrado: ");
        for (int aux = 0; aux < vet.Length; aux++)
        {
            Console.Write(Math.Pow(vet[aux],2)+ " ");
        }
        Console.WriteLine("\r\n Aperte Enter para finalizar");
        Console.ReadLine();
    }
}