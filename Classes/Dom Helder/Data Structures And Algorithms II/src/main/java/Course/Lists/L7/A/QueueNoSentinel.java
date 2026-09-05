package Course.Lists.L7.A;

public class QueueNoSentinel {
    private Cell<Integer> first, last;
    private int size;


    public QueueNoSentinel(){
        this.first = null;
        this.last = null;
    }

    public void enqueue(int i){
        Cell<Integer> tmp = new Cell<>(i);
        if (isEmpty()) {
            first = tmp;
            last = tmp;
        } else {
            last.setNext(tmp);
            last = tmp;
        }
        size++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Integer dequeue() {
        if (isEmpty()) throw new RuntimeException("Empty Queue!");
        int element = first.getElement();
        first = first.getNext();
        if (first == null) last = null;
        size--;
        return element;
    }

    public void showQueue() {
        System.out.print("[ ");
        for (Cell<Integer> c = first; c != null; c = c.getNext()) {
            System.out.print(c.getElement() + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        QueueNoSentinel fila = new QueueNoSentinel();
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.showQueue();

        fila.dequeue();
        fila.showQueue();

    }
}
