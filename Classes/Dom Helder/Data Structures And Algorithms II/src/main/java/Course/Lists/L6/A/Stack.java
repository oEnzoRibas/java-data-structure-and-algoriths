package Course.Lists.L6.A;

import Course.Lists.L6.Cell;


public class Stack {

    private Cell<Integer> top;
    private int size = 0;

    // q1
    public Stack() {
        this.top = null;
    }

    public void push(Integer i) {
        Cell<Integer> tmp = new Cell<>(i);
        tmp.setNext(this.top);
        this.top = tmp;
        tmp = null;
        this.size++;
    }

    public void pop() throws Exception {
        if (this.top == null) {
            throw new Exception("Stack is already empty!");
        }
        int element = this.top.getElement();
        Cell<Integer> tmp = this.top;
        this.top = this.top.getNext();
        tmp.setNext(null);
        tmp = null;
        this.size--;
    }

    public void showStack() {
        System.out.println("[");
        for (Cell<Integer> c = this.top; c != null; c = c.getNext()) {
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

    //q3
    public int max() {
        int max = this.top.getElement();
        for (Cell<Integer> c = this.top.getNext(); c != null; c = c.getNext()) {
            if (c.getElement() > max) {
                max = c.getElement();
            }
        }
        return max;
    }

    //q4
    public void popOrder(Cell<Integer> top) {
        System.out.println(top.getElement());
        if (top.getNext() == null) {
            return;
        }
        popOrder(top.getNext());
    }

    //q5
    public void bubbleSort() throws RuntimeException {
        if (top == null) throw new RuntimeException("Empty List");

        boolean swapped;
        do {
            swapped = false;
            for (Cell<Integer> c2 = this.top; c2.getNext() != null; c2 = c2.getNext()) {
                if (c2.getElement() > c2.getNext().getElement()) {

                    Integer tmp = c2.getElement();
                    c2.setElement(c2.getNext().getElement());
                    c2.getNext().setElement(tmp);
                    swapped = true;
                }

            }
        } while (swapped);
    }

    //q6
    public void selectionSort() throws RuntimeException {
        if (top == null) throw new RuntimeException("Empty List");

        for (Cell<Integer> i = this.top; i != null; i = i.getNext()) {
            Cell<Integer> min = i;
            for (Cell<Integer> j = i.getNext(); j != null; j = j.getNext()) {
                if (j.getElement() > min.getElement()) {
                    min = j;
                }
            }

            Integer tmp = i.getElement();
            i.setElement(min.getElement());
            min.setElement(tmp);
        }
    }

    public void pointerSelectionSort() throws RuntimeException {
        if (top == null) throw new RuntimeException("Empty List");
        Cell<Integer> dummy = new Cell<>();
        Cell<Integer> st = dummy;
        dummy.setNext(this.top);

        while (st.getNext() != null) {
            Cell<Integer> minPrev = st;
            Cell<Integer> prev = st.getNext();
            Cell<Integer> curr = prev.getNext();

            while (curr != null) {
                if (curr.getElement() > minPrev.getNext().getElement()) {
                    minPrev = prev;
                }
                prev = curr;
                curr = curr.getNext();
            }
            if (minPrev == st) {
                st = st.getNext();
                continue;
            }

            Cell<Integer> minNode, i, nextI, nextMin;
            i = st.getNext();
            minNode = minPrev.getNext();
            nextI = i.getNext();
            nextMin = minNode.getNext();

            st.setNext(minNode);
            minNode.setNext(nextI);
            i.setNext(nextMin);
            minPrev.setNext(i);

            st = st.getNext();
        }
        top = dummy.getNext();
    }


    //q7
    public void insertionSort() throws RuntimeException {
        if (top == null) throw new RuntimeException("Empty List");

        Cell<Integer> cur, prev, dummy = new Cell<>();
        dummy.setNext(this.top);
        prev = this.top;
        cur = this.top.getNext();

        while (cur != null) {
            if (cur.getElement() >= prev.getElement()) {
                prev = cur;
                cur = cur.getNext();
            } else {

                Cell<Integer> tmp = dummy;
                while (cur.getElement() > tmp.getNext().getElement()) {
                    tmp = tmp.getNext();
                }

                prev.setNext(cur.getNext());
                cur.setNext(tmp.getNext());
                tmp.setNext(cur);
                cur = prev.getNext();
            }

        }
        top = dummy.getNext();
    }

    // q8
    public void countingSortDesc() throws RuntimeException {
        if (top == null) throw new RuntimeException("Empty List");

        int min = top.getElement();
        int max = top.getElement();
        for (Cell<Integer> cur = top.getNext(); cur != null; cur = cur.getNext()) {
            if (cur.getElement() < min) min = cur.getElement();
            if (cur.getElement() > max) max = cur.getElement();
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (Cell<Integer> cur = top; cur != null; cur = cur.getNext()) {
            count[cur.getElement() - min]++;
        }

        Cell<Integer> cur = top;
        for (int i = range - 1; i >= 0; i--) {
            while (count[i] > 0) {
                cur.setElement(i + min);
                cur = cur.getNext();
                count[i]--;
            }
        }
    }

    public Cell<Integer> getTop() {
        return top;
    }

    //q9
    public static void main(String[] args) {
        Stack pilha = new Stack();

        pilha.push(6);
        pilha.push(1);
        pilha.push(2);
        pilha.push(-3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(2);
        System.out.println("Stack:");
        pilha.showStack();

        System.out.printf("""
                        Is Empty?, %b
                        Size: %d
                        Sum of elements: %d
                        Max: %d
                        """,
                pilha.isEmpty(),
                pilha.getSize(),
                pilha.sum(pilha.getTop()),
                pilha.max()
        );

        System.out.println("Pop Order:");
        pilha.popOrder(pilha.getTop());

        System.out.println("---------------------");
        System.out.println("Bubble Sort");
        pilha.push(21);
        pilha.bubbleSort();
        pilha.showStack();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Decreasing Selection Sort");
        pilha.push(2112);
        pilha.selectionSort();
        pilha.showStack();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Decreasing Selection Sort By Pointers");
        pilha.push(11112);
        pilha.pointerSelectionSort();
        pilha.showStack();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Insetion Sort");
        pilha.push(212);
        pilha.insertionSort();
        pilha.showStack();
        System.out.println("---------------------");

        System.out.println("---------------------");
        System.out.println("Count Sort");
        pilha.push(212);
        pilha.countingSortDesc();
        pilha.showStack();
        System.out.println("---------------------");

    }
}
