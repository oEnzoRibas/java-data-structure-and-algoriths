package Course.Lists.L8.B;

public class DoublyLinkedList<T> {

    private DoubleCell<T> first;
    private DoubleCell<T> last;
    private int size;

    public DoublyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void show() {
        System.out.print("[ ");
        DoubleCell<T> current = first;
        while (current != null) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println("]");
    }

    public void insertStart(T x) {
        DoubleCell<T> newNode = new DoubleCell<>(x);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
        size++;
    }

    public void insertEnd(T x) {
        DoubleCell<T> newNode = new DoubleCell<>(x);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrev(last);
            last = newNode;
        }
        size++;
    }

    public T removeStart() {
        if (isEmpty()) throw new RuntimeException("List is empty!");

        T removed = first.getElement();

        if (size == 1) {
            first = last = null;
        } else {
            first = first.getNext();
            first.setPrev(null);
        }

        size--;
        return removed;
    }

    public T removeEnd() {
        if (isEmpty()) throw new RuntimeException("List is empty!");

        T removed = last.getElement();

        if (size == 1) {
            first = last = null;
        } else {
            last = last.getPrev();
            last.setNext(null);
        }

        size--;
        return removed;
    }

    private DoubleCell<T> getNode(int p) {
        if (p < 0 || p >= size) throw new IndexOutOfBoundsException("Invalid position!");

        // optimization: decide direction
        if (p < size / 2) {
            DoubleCell<T> current = first;
            for (int i = 0; i < p; i++) current = current.getNext();
            return current;
        } else {
            DoubleCell<T> current = last;
            for (int i = size - 1; i > p; i--) current = current.getPrev();
            return current;
        }
    }

    public void insertPosition(int p, T x) {
        if (p < 0 || p > size) throw new IndexOutOfBoundsException("Invalid position!");

        if (p == 0) {
            insertStart(x);
            return;
        }
        if (p == size) {
            insertEnd(x);
            return;
        }

        DoubleCell<T> current = getNode(p);
        DoubleCell<T> newNode = new DoubleCell<>(x);

        DoubleCell<T> before = current.getPrev();

        before.setNext(newNode);
        newNode.setPrev(before);

        newNode.setNext(current);
        current.setPrev(newNode);

        size++;
    }

    public T removePosition(int p) {
        if (p < 0 || p >= size) throw new IndexOutOfBoundsException("Invalid position!");

        if (p == 0) return removeStart();
        if (p == size - 1) return removeEnd();

        DoubleCell<T> current = getNode(p);

        DoubleCell<T> before = current.getPrev();
        DoubleCell<T> after = current.getNext();

        before.setNext(after);
        after.setPrev(before);

        size--;

        return current.getElement();
    }
}

