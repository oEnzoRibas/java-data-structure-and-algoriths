package Course.Classes.HashTable;

public class OpenAddressHashTable {


    private int[] hashTable;
    int of, ofUsed =0 ;
    int m;
    int TOTALSIZE = m+of;



    OpenAddressHashTable(int m, int of){
        this.of = of;
        this.m = m;
        this.TOTALSIZE = m+of;
        this.hashTable = new int[this.TOTALSIZE];
        for (int i = 0; i < TOTALSIZE; i++){
            hashTable[i] = -1;
        }
    }

    int hash(int x){
        int hash;
        hash = x % m;
        if (hash < 0) throw new RuntimeException("Error while hashing!");
        return  hash;
    }

    void show(){
        for (int i = 0; i < TOTALSIZE ;i++) {
            System.out.print(i + " ------ ");
            if ( hashTable[i] >= 0) System.out.print(hashTable[i]);
            System.out.println();
        }
    }

    void insert(int x){
        int hash = hash(x);

        if (occupied(x)){
            hashTable[m+ofUsed++] = x;
        }else {
            hashTable[hash] = x;
        }
    }

    boolean occupied(int x){
        int hash = hash(x);
        return hashTable[hash] >= 0;
    }

    int search(int x){
        int hash = hash(x);
        int resp = -1;
        int storedInHash = hashTable[hash];
        if (storedInHash == x ) return hash;
        else {
            for (int i = 0; i < ofUsed; i++){
                if ( hashTable[m+i] == x){
                    resp = m+i;
                }
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        OpenAddressHashTable ht = new OpenAddressHashTable(13, 3);
        ht.insert(22);
        ht.insert(11);
        ht.insert(12);
        ht.insert(0);
        ht.insert(14);
        ht.insert(26);
        ht.insert(39);
        ht.show();

        System.out.println(ht.search(22));
    }

}
