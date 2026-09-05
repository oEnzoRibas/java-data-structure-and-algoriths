using System;
using System.Windows.Forms;

class Program
{
    static void Main()
    {
        // Exibir uma mensagem de informação
        MessageBox.Show("Olá, mundo!", "Mensagem");

        // Exibir uma mensagem de confirmação
        DialogResult result = MessageBox.Show("Você quer continuar?",
            "Confirmação", MessageBoxButtons.YesNo);

        if (result == DialogResult.Yes)
        {
            MessageBox.Show("Usuário escolheu sim.");
        }
        else
        {
            MessageBox.Show("Usuário escolheu não.");
        }
    }
}