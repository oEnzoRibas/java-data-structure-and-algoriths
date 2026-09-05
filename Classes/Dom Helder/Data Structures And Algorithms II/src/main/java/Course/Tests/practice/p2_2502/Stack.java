package Course.Tests.practice.p2_2502;

import Course.Lists.L6.Cell;

public class Stack<E> {

    private Cell<E> top;
    private int size = 0;

    public Stack() {
        this.top = null;
    }

    public void push(E i) {
        Cell<E> tmp = new Cell<>(i);
        tmp.setNext(this.top);
        this.top = tmp;
        tmp = null;
        this.size++;
    }

    public E pop() throws RuntimeException {
        E element = this.top.getElement();
        Cell<E> tmp = this.top;
        this.top = this.top.getNext();
        tmp.setNext(null);
        tmp = null;
        this.size--;
        return element;
    }

    public void showStack() {
        System.out.println("[");
        for (Cell<E> c = this.top; c != null; c = c.getNext()) {
            System.out.println(c.getElement() + " ");
        }
        System.out.println("]");
    }

    public boolean isEmpty() {
        return (this.top == null);
    }

    public int getSize() {
        return this.size;
    }

    //q2
    public int sum(Cell<Integer> top) {
        if (top == null) return 0;
        return top.getElement() + sum(top.getNext());
    }


    public Cell<E> getTop() {
        return top;
    }

    public void setTop(Cell<E>i){
        this.top = i;
    }
}
