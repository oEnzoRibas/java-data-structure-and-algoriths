package Course.Tests.practice.p1_2501.B;

public class CompraParafusos {
    private int quantidade;
    final double preco = 0.50;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws QuantidadeInvalidaException{
        if ( quantidade < 0){
            this.quantidade = 0;
            throw new QuantidadeInvalidaException("\nQuantidade Inválida!\n");
        }

        this.quantidade = quantidade;
    }

    public double calculaTotal(int qnt){
        double desconto = 0;

        if (qnt > 400){
            desconto = 0.4;
        }else if (qnt >300){
            desconto = 0.3;
        }else if (qnt > 200){
            desconto = 0.2;
        } else if (qnt > 100) {
            desconto = 0.1;
        }

        return qnt * preco * (1-desconto);
    }
}
