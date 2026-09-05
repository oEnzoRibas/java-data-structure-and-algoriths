package Course.Lists.L4.Exs.K;

public class recursiveSeries {
    public static void main(String[] args) {
        System.out.println(T(5));
    }

    static int T(int n){
        int t0 = 1, t1 =2;
        switch (n){
            case 0 -> {
                return t0;
            }
            case 1 -> {
                return t1;
            }
        }
        return T(n-1) * T(n-2) - T(n-1);
    }
}
