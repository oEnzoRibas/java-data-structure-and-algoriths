package Course.Tests.finalTest.provafinal.b;


import javax.swing.plaf.InsetsUIResource;

public class ListaDupla {

    private NodeD first;
    private NodeD last;
    private float menorValor; //
    private float maiorValor = 0; //como não existe leitura de energia negativa, 0 é suficiente
    private int size = 0;

    ListaDupla(){
        this.first = new NodeD();
        this.last = new NodeD();
    }

    public void insertStart(float x){
        if(size == 0){
            this.maiorValor = x;
            this.menorValor = x;
        }else {
            if (x > this.maiorValor){
                this.maiorValor = x;
            }

            if (x < this.menorValor){
                this.menorValor =  x;
            }
        }
        // cria novo no
        NodeD newNode = new NodeD(x);

        // se ta vazio
        if (this.first.getNext() == null){
            // prox depois da cabeça é o novo
            this.first.setNext(newNode);

            // ultimo é o novo
            this.last = newNode;

            // anterior do novo é primeiro
            newNode.setPrev(this.first);
        }

        // pega o primeiro
        NodeD tmp = this.first.getNext();

        // coloca o sentinela como anterior do inserido
        newNode.setPrev(this.first);

        // coloca o antigo primeiro como proximo no novo
        newNode.setNext(tmp);

        // coloca o anterior do antigo novo o novo novo
        tmp.setPrev(newNode);

        size++;


    }




    public float amplitude(){
        return maiorValor-menorValor;
    }

    public static void main(String[] args) {
        ListaDupla a  = new ListaDupla();

        a.insertStart(2);

        a.insertStart(3);
        a.insertStart(4);
        a.insertStart(51);

        System.out.println(a.amplitude());
    }

}
