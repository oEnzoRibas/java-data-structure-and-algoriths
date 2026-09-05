package Course.Lists.L1.Exs.B;

import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {
        Integer n = 3, m = 5;
        ArrayList<Integer> result;

        result = getMultiples(n,m);

        for (Integer i : result){
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> getMultiples(Integer n, Integer m) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (Integer i = 0; i < 100; i++) {
            if ((i % n == 0) || (i % m == 0) ){
                resultList.add(i);
            }
        }
        return resultList;
    }

}
