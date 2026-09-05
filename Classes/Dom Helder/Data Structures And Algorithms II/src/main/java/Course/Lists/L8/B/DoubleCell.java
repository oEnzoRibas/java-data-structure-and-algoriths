package Course.Lists.L8.B;

public class DoubleCell<T> {
    private T element;
    private DoubleCell<T> prev;
    private DoubleCell<T> next;

    public DoubleCell(T element) {
        this.element = element;
        this.prev = null;
        this.next = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public DoubleCell<T> getPrev() {
        return prev;
    }

    public void setPrev(DoubleCell<T> prev) {
        this.prev = prev;
    }

    public DoubleCell<T> getNext() {
        return next;
    }

    public void setNext(DoubleCell<T> next) {
        this.next = next;
    }
}

