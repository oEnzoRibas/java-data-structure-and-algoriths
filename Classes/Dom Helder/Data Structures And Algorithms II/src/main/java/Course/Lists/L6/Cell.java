package Course.Lists.L6;

public class Cell<E> {

    private E element;
    private Cell<E> next;

    public Cell() {
    }

    public Cell(E x) {
        this.element = x;
        this.next = null;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E n) {
        this.element = n;
    }

    public Cell<E> getNext() {
        return this.next;
    }

    public void setNext(Cell<E> cell) {
        this.next = cell;
    }
}
