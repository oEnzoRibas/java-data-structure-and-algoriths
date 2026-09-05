using System; // Para usar Console, String, etc.
using System.Collections.Generic; // Para usar List<T>
using System.Linq; // Para usar LINQ
using System.Text; // Para usar StringBuilder

namespace ExampleNamespace
{
    class Program
    {
        static void Main(string[] args)
        {
            // Usando System
            Console.WriteLine("Exemplo de uso de System");

            // Usando System.Collections.Generic
            List<int> num = new List<int> { 1, 2, 3, 4, 5 };

            // Usando System.Linq
            var NumPar = numbers.Where(n => n % 2 == 0).ToList();
            Console.WriteLine("Números pares: " + string.Join(", ", evenNumbers));

            // Usando System.Text
            StringBuilder sb = new StringBuilder();
            sb.Append("Exemplo de uso de ");
            sb.Append("StringBuilder.");
            Console.WriteLine(sb.ToString());
        }
    }
}
