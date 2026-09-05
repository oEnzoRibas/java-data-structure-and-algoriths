package Course.Lists.L4.Exs.D;

public class recursiveNumOfDigits {
    public static void main(String[] args) {
        System.out.println(numOfDigits(-11232));
    }

    static int numOfDigits(int n){
        n = Math.abs(n);
        if (n<= 0) return 0;
        return 1 + numOfDigits(n / 10 );
    }
}
