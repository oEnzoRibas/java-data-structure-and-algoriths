package Course.Lists.L8.A;

// q1
public class LinearList<T> {
    private T[] array;
    private int n;

    public LinearList(int size) {
        this.array = (T[]) new Object[size];
        this.n = 0;
    }

    public int getTamanho() {
        return n;
    }

    public boolean isEmpty() {
        return (this.n == 0);
    }

    public void show() {
        System.out.print("[ ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    /**
     * Question 2
     *
    */
    private void memoryReallocateIfNeeded() {
        if (n < array.length) return;
        else {
            int newSize = 2 * n;
            T[] newArray = (T[]) new Object[newSize];
            for (int i = 0; i < n; i++) newArray[i] = array[i];
            array = newArray;
            System.out.println("Memory Relocated");
        }
    }

    public void insertStart(T x) {
        memoryReallocateIfNeeded();

        for (int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }
        this.array[0] = x;
        n++;
    }

    public T removeStart() {
        if (this.isEmpty()) throw new RuntimeException("Empty List!");

        T item = array[0];
        for (int i = 0; i < n-1; i++) {
            array[i] = array[i + 1];
        }

        array[--n] = null;

        return item;

    }

    public void insertEnd(T x) {
        memoryReallocateIfNeeded();

        this.array[n] = x;
        n++;
    }

    public T removeEnd() {
        T item = array[n];

        array[--n] = null;
        return item;
    }

    public void insertPosition(int p, T x){
        if (p < 0 || p > n) throw new IndexOutOfBoundsException("Invalid Position!");
        memoryReallocateIfNeeded();
        for (int i = n; i > p; i--){
            this.array[i] = this.array[i-1];
        }
        this.array[p] = x;
        this.n++;
    }

    public T removePosition(int p){
        T item = array[p];
        for (int i = p; i < n; i++){
            this.array[i] = this.array[i+1];
        }
        this.n--;
        return item;
    }



    public static void main(String[] args) {

        // ---------- TESTE COM STRING ----------
        System.out.println("=== Teste com String ===");
        LinearList<String> ls = new LinearList<>(10);
        ls.insertEnd("A");
        ls.insertStart("B");
        ls.insertPosition(1, "C");
        ls.show();   // [ B, C, A ]
        System.out.println("removido inicio: " + ls.removeStart());
        System.out.println("removido pos 1: " + ls.removePosition(1));
        ls.show();
        System.out.println();

        // ---------- TESTE COM INTEGER ----------
        System.out.println("=== Teste com Integer ===");
        LinearList<Integer> li = new LinearList<>(10);
        li.insertEnd(10);
        li.insertStart(20);
        li.insertPosition(1, 30);
        li.show();   // [ 20, 30, 10 ]
        System.out.println("removido inicio: " + li.removeStart());
        System.out.println("removido pos 0: " + li.removePosition(0));
        li.show();
        System.out.println();

        // ---------- TESTE COM FLOAT ----------
        System.out.println("=== Teste com Float ===");
        LinearList<Float> lf = new LinearList<>(10);
        lf.insertEnd(1.5f);
        lf.insertStart(2.2f);
        lf.insertPosition(1, 3.3f);
        lf.show();   // [ 2.2, 3.3, 1.5 ]
        System.out.println("removido inicio: " + lf.removeStart());
        System.out.println("removido pos 1: " + lf.removePosition(1));
        lf.show();
        System.out.println();

        // ---------- TESTE COM CHARACTER ----------
        System.out.println("=== Teste com Character ===");
        LinearList<Character> lc = new LinearList<>(10);
        lc.insertEnd('X');
        lc.insertStart('Y');
        lc.insertPosition(1, 'Z');
        lc.show();   // [ Y, Z, X ]
        System.out.println("removido inicio: " + lc.removeStart());
        System.out.println("removido pos 1: " + lc.removePosition(1));
        lc.show();
    }

}

