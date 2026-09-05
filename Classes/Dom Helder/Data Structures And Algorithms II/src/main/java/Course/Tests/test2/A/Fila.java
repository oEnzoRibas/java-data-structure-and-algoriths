package Course.Tests.test2.A;

import javax.imageio.stream.ImageInputStream;

public class Fila {
    CelulaInt first, last;
    int tam;


    public Fila() {
        this.first = null;
        this.last = null;
        this.tam = 0;
    }

    public void enfileirar(int x) {
        CelulaInt tmp = new CelulaInt(x);
        if (tam == 0) {
            last = tmp;
            first = tmp;
        } else {
            this.last.setProx(tmp);
            last = last.getProx();

        }
        tam++;
    }

    public int removerDaFila() {
        int element = this.first.getElemento();
        this.first = this.first.getProx();
        tam--;
        return element;
    }

    public int tamanhoDaFila() {
        return this.tam;
    }

    public void mostrarfila() {

        System.out.println("[");
        for (CelulaInt c = this.first; c != null; c = c.getProx()) {
            System.out.println(c.getElemento());
        }
        System.out.println("]");
    }

    public double media() {
        return (double) this.soma() / this.tam;
    }

    public int soma() {
        int soma = 0;
        for (CelulaInt c = this.first; c != null; c = c.getProx()) {
            soma += c.getElemento();
        }
        return soma;
    }

    public void furafila(int e){

        CelulaInt ant= first;
        CelulaInt pos = ant.getProx();
        for (CelulaInt c = this.first; c != null; c = c.getProx()){
            if(c.getProx().getElemento() == e){
                ant = c;
                pos = c.getProx();
                break;
            }

        }



        ant.setProx(pos.getProx());
        pos.setProx(this.first);
        this.first = pos;



    }

    public boolean binarySearch(int key){
        this.selectionSort();
        CelulaInt pri = this.first, ult = last;
        while(pri.getElemento() < ult.getElemento()) {

            CelulaInt midCell = pri;

            // pega celula do meio
            for (int i = 0; i <= tam / 2; i++) {
                midCell = midCell.getProx();
            }

            if (midCell.getElemento() == key) {
                return true;
            }

            if (key > midCell.getElemento()){
                pri = midCell.getProx();
            }
            pri = pri.getProx();

        }
        return false;
    }

    public void selectionSort() {
        for (CelulaInt c = this.first; c != null; c = c.getProx()) {
            CelulaInt minCell = this.first;
            int min = this.first.getElemento();
            for (CelulaInt d = c.getProx(); d != null; d = d.getProx()) {
                if (d.getElemento() < min) {
                    min = d.getElemento();
                    minCell = d;
                }
                if (c.getElemento() > min) {
                    int tmp = c.getElemento();
                    c.setElemento(min);
                    minCell.setElemento(tmp);
                }
            }
        }
    }

    // CORRETO
//    public void selectionSort() {
//        for (CelulaInt c = this.first; c != null; c = c.getProx()) {
//            CelulaInt minCell = c;
//            int min = c.getElemento();
//            for (CelulaInt d = c.getProx(); d != null; d = d.getProx()) {
//                if (d.getElemento() < min) {
//                    min = d.getElemento();
//                    minCell = d;
//                }
//                if (c.getElemento() > min) {
//                    int tmp = c.getElemento();
//                    c.setElemento(min);
//                    minCell.setElemento(tmp);
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileirar(1);
        fila.enfileirar(15);
        fila.enfileirar(61);
        fila.enfileirar(3113);
        fila.enfileirar(711);

        fila.selectionSort();
        fila.mostrarfila();

        fila.furafila(15);

        fila.mostrarfila();

    }
}
