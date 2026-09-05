package Course.Tests.practice.p2_2502.C;

import Course.Lists.L6.Cell;

public class Fila<E> {

    Cell<E> top;
    Cell<E> bottom;

    public Fila() {
        this.top = null;
        this.bottom = null;
    }

    public void empilhar(E i) {
        Cell<E> tmp = new Cell<>(i);
        if (this.top == null) {
            tmp.setNext(tmp);
            this.top = tmp;
            this.bottom = tmp;
        } else {
            tmp.setNext(this.top);
            this.top = tmp;
            tmp = null;
            this.bottom.setNext(this.top);
        }
    }

    public Cell<E> desempilhar(){
        Cell<E> element = this.top;
        if (this.top == this.bottom){
            this.top = null;
            this.bottom = null;
        }
        else{
            this.top = this.top.getNext();
            this.bottom.setNext(this.top);
        }
        return element;
    }

    public void mostrarFila() {

        System.out.println("[");
        Cell<E> aux = this.top;
        do {
            System.out.println(aux.getElement() + " ");
            aux= aux.getNext();
        }while (aux != this.top);
        System.out.println("]");
    }
    public int getMin() throws RuntimeException{
        if (this.top == null) throw new IllegalStateException("Fila vazia!");

        int min = (Integer) this.top.getElement();

        for (Cell<E> c = this.top.getNext(); c != this.top; c = c.getNext()) {
            if ((Integer) c.getElement() < min) {
                min = (Integer) c.getElement();
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.empilhar(1);
        fila.empilhar(2);
        fila.empilhar(-3);
        fila.empilhar(2);
        fila.desempilhar();
        fila.mostrarFila();
        System.out.println(fila.getMin());
    }
}
