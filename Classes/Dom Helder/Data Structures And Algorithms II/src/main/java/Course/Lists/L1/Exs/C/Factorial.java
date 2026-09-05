package Course.Lists.L1.Exs.C;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner kIn = new Scanner(System.in);

        System.out.println("Write a number");
        n = kIn.nextInt();
        System.out.println(factorial(n));
    }
    private static Integer factorial(Integer n){
        if (n == 0){
            return 1;
        }
        return factorial(n-1) * n;
    }
}
