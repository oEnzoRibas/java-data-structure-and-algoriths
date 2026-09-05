package Course.Lists.L4.Exs.F;

public class recursiveMuplicator {
    public static void main(String[] args) {
        System.out.println(multiply(123,5));
    }


    public static int multiply(int a, int b){
        if (b == 0) return 0;
        return a + multiply(a, b-1);
    }
}
