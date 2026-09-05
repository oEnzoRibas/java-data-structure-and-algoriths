package Course.Lists.L7.A;

public class Queue {
    private Cell<Integer> first,  last;
    private int size;

    // q1
    public Queue(){
        this.first = new Cell<>();
        this.last = first;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void enqueue(int i){
        Cell<Integer> tmp = new Cell<Integer>(i);
        last.setNext(tmp);
        last = last.getNext();
        this.size++;
    }

    public Integer dequeue(){
        Cell<Integer> tmp = this.first;
        this.first = this.first.getNext();
        int element = this.first.getElement();
        tmp.setNext(null);
        tmp = null;
        this.size--;
        return element;
    }

    public void showQueue() {
        System.out.println("[");
        for (Cell<Integer> c = this.first.getNext(); c != null; c = c.getNext()) {
            System.out.println(c.getElement() + " ");
        }
        System.out.println("]");
    }

    // q2
    public int amplitude(){
        return this.getMax() - this.getMin();
    }

    public int getMax(){
        if (this.isEmpty()) throw new RuntimeException("Empty Queue!");

        int max = this.first.getNext().getElement();
        for (Cell<Integer> c = this.first.getNext(); c != null ;c = c.getNext()) {
            if( c.getElement() > max){
                max = c.getElement();
            }
        }
        return max;
    }

    public int getMin(){
        if (this.isEmpty()) throw new RuntimeException("Empty Queue!");

        int min = this.first.getNext().getElement();
        for (Cell<Integer> c = this.first.getNext(); c != null ;c = c.getNext()) {
            if( c.getElement() < min){
                min = c.getElement();
            }
        }
        return min;
    }

    public boolean isEmpty(){
        return this.first == this.last;
    }

    // q3
    public double mean(){
        if (this.getSize() == 0) throw new RuntimeException("Empty List!");
        return (double) sum() / this.size;
    }

    public int sum(){
        int sum = 0;
        for (Cell<Integer> c = this.first.getNext(); c != null ; c = c.getNext()) {
            sum += c.getElement();
        }
        return sum;
    }

    // q4
    public void furaFila(int e, int n){

        Cell<Integer> tmp = new Cell<>(e);

        Cell<Integer> prev = this.first;
        Cell<Integer> aux = this.first.getNext();

        for (int i = 1; i < n ; i++){
            prev = prev.getNext();
            aux = aux.getNext();
        }

        prev.setNext(tmp);
        tmp.setNext(aux);
    }

    // q5
    public int getMinRecursive() {
        if (this.first.getNext() == null) {
            throw new RuntimeException("Empty List!");
        }
        return getMinRecursiveHelper(this.first.getNext());
    }

    private int getMinRecursiveHelper(Cell<Integer> c) {
        if (c.getNext() == null) {
            return c.getElement();
        }

        int minRestante = getMinRecursiveHelper(c.getNext());

        return Math.min(c.getElement(), minRestante);
    }

    // q6
    public void invert() {
        if (this.size <= 1) return;

        int[] arr = new int[this.size];
        Cell<Integer> current = this.first.getNext();
        for (int i = 0; i < this.size; i++) {
            arr[i] = current.getElement();
            current = current.getNext();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        this.first = new Cell<>();
        this.last = this.first;
        this.size = 0;
        for (int value : arr) {
            this.enqueue(value);
        }
    }

    // q7
    public void shellSort() {
        if (this.size <= 1) return;

        int[] arr = new int[this.size];
        Cell<Integer> current = this.first.getNext();
        for (int i = 0; i < this.size; i++) {
            arr[i] = current.getElement();
            current = current.getNext();
        }

        for (int gap = this.size / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < this.size; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }

        this.first = new Cell<>();
        this.last = this.first;
        this.size = 0;
        for (int value : arr) {
            this.enqueue(value);
        }
    }

    // q8
    public void quickSort() {
        if (this.size <= 1) return;

        int[] arr = new int[this.size];
        Cell<Integer> current = this.first.getNext();
        for (int i = 0; i < this.size; i++) {
            arr[i] = current.getElement();
            current = current.getNext();
        }

        quickSortHelper(arr, 0, this.size - 1);

        this.first = new Cell<>();
        this.last = this.first;
        this.size = 0;
        for (int value : arr) {
            this.enqueue(value);
        }
    }

    private void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void main(String[] args) {

        Queue fila = new Queue();

        for (int i = 1; i <= 4; i++) {
            fila.enqueue(i);
        }

        System.out.println("Fila");
        fila.showQueue();
        System.out.println("Amplitude");
        System.out.println(fila.amplitude());
        System.out.println("Media");
        System.out.println(fila.mean());

        System.out.println("----Fura fila----");
        System.out.println("Antes");
        fila.showQueue();
        // fura fila
        fila.furaFila(-9,2);
        System.out.println("Depois");
        fila.showQueue();
        System.out.println("Min recusivo");
        System.out.println(fila.getMinRecursive());

        System.out.println("Inverter");
        fila.invert();
        fila.showQueue();

        System.out.println("Shell Sort");
        fila.shellSort();
        fila.showQueue();

        fila.enqueue(10);

        fila.showQueue();
        System.out.println("Quick Sort");
        fila.quickSort();
        fila.showQueue();

    }
}
