package Course.Classes.HashTable;


class Node<E>{
    private E value;
    private Node<E> next;

    Node (){
        this(null);
    }

    Node (E value){
        this.value = value;
    }

    void setValue(E value){
        this.value = value;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

    E getValue(){
        return this.value;
    }

    Node<E> getNext(){
        return this.next;
    }
}

class List<E>{
    private final Node<E> first;
    private Node<E> last;


    public List(){
        first = new Node<>();
        last = first;
    }

    void appendStart(E x){
        Node<E> tmp = new Node<>(x);
        tmp.setNext(this.first.getNext());
        this.first.setNext(tmp);
        if (first == last) last = tmp;
        tmp = null;
    }

    void appendEnd(E x){
        Node<E> tmp = new Node<>(x);
        this.last.setNext(tmp);
        this.last = tmp;
    }

    E removeStart(){
        if (this.first == this.last) throw new RuntimeException("Empty List");

        Node<E> nodeToBeRemoved = this.first.getNext();
        this.first.setNext(nodeToBeRemoved.getNext());

        return nodeToBeRemoved.getValue();
    }

    E removeEnd(){
        if (this.first == this.last) throw new RuntimeException("Empty List");

        Node<E> previous = first, nodeToBeRemoved = this.last;

        for (Node<E> i = this.first; i.getNext() != nodeToBeRemoved; i = i.getNext() ) {
            previous = i;
        }
        previous.setNext(null);
        this.last = previous;

        return nodeToBeRemoved.getValue();
    }

    Boolean containsValue(E value){
        for (Node<E> i = first.getNext(); i != null; i = i.getNext()){
            if (i.getValue().equals(value)) return true;
        }
        return false;
    }

    public void show(){
            System.out.print("[");

        Node<E> node = this.first.getNext();
        while (node != null){
        System.out.print(node.getValue());
            if (node.getNext() != null) System.out.print(" ,");
            node = node.getNext();
        }
        System.out.print("]");
    }

}

public class SeparateChainingHashTable {

    private List<String> hashTable [];

    SeparateChainingHashTable(){
        this(13);
    }
    SeparateChainingHashTable(int m){
        if (m <=0 ) throw new RuntimeException("Invalid Size!");
        hashTable = new List[m];
        for (int i = 0; i < m; i++) {
            hashTable[i] = new List<>();
        }
    }

    private  int getAsciiSum(String str){
        int sum = 0;
        for (char ch : str.toCharArray()){
           sum+= ch;
        }
        return sum;
    }

    private int hash(String x){
        int ascii = getAsciiSum(x);
        return ascii % this.hashTable.length;
    }

    public void insert(String x){
        int hash = hash(x);

        hashTable[hash].appendEnd(x);
    }

    public Boolean search(String x){
        int hash = hash(x);
        return hashTable[hash].containsValue(x);
    }

    public void show(){
        for ( int i = 0 ; i < hashTable.length; i++){
            System.out.print(i + " ----- ");
            hashTable[i].show();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SeparateChainingHashTable ht = new SeparateChainingHashTable();

        ht.insert("Enzo");
        ht.insert("Bia");
        ht.insert("Claudio");
        ht.insert("Antônio");
        ht.insert("José");
        ht.insert("Gilliard");
        ht.insert("Linda");
        ht.insert("Moisés");
        ht.insert("enzo");
        ht.show();

    }
}
