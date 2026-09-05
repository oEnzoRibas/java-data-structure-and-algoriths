using System;

namespace Classes_03
{
    public class Switch

    // Exemplo de um Switch Case em C#.
    // @Autores: Enzo R. L. D. Ribas && Ana Luiza 
    {
        public static void Main(string[] args)
        {
            int pts;

            Console.WriteLine("Informe a pontuação na prova: ");
            pts = int.Parse(Console.ReadLine() ?? "0");

            switch (pts)
            {
                case int n when (n >= 0 && n <= 5):
                    Console.WriteLine("Você foi reprovado!");
                    break;
                case int n when (n >= 6 && n <= 10):
                    Console.WriteLine("Você foi aprovado!");
                    break;
                default:
                    Console.WriteLine("Nota Inválida!");
                    break;
            }
            Console.WriteLine("\r\n Aperte Enter para finalizar");
            Console.ReadLine();
        }
    }
}

