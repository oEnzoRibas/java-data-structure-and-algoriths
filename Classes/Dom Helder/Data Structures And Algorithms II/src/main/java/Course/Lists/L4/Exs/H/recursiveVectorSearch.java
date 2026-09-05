package Course.Lists.L4.Exs.H;

import java.util.Vector;

public class recursiveVectorSearch {
    public static void main(String[] args) {
        int[] vetor = {10,2,3,4,12,6};


        System.out.println(indexOf(12,vetor,0));

    }

    static int indexOf(int k, int[] v, int i){

        if (i == v.length) return -1;
        if (v[i] == k) return i;

        return indexOf(k, v, ++i);

    }
}
