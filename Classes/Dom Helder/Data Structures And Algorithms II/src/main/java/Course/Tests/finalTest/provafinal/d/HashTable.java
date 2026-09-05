package Course.Tests.finalTest.provafinal.d;

public class HashTable {

    int[] tabela;

    HashTable(int m){
        tabela = new int[m];
    }

    HashTable(){
        this(13);
    }

    int hash(int x){
        return  x>0? x%tabela.length : -x % tabela.length;
    }

    void insert(int x){
        int hashed = hash(x);
        tabela[hashed] = x;
    }

    void remove(int x){
        int hashed = hash(x);
        tabela[hashed] = Integer.parseInt(null);
    }


    public static void main(String[] args) {
        HashTable a = new HashTable();

        a.insert(2);
    }
}
