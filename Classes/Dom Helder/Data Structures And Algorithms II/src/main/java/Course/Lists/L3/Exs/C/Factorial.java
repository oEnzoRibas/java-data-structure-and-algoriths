package Course.Lists.L3.Exs.C;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner kIn = new Scanner(System.in);

        System.out.println("Write a number");
        n = kIn.nextInt();

        try {
            System.out.println(factorial(n));
        } catch (FactorialTooBig e) {
            System.out.println(e.getMessage());
        }
    }
    private static Integer factorial(Integer n) throws FactorialTooBig{

        if (n > 19 ){
            throw new FactorialTooBig("This number is to big to calculate it's factorial");
        }

        if (n == 0){
            return 1;
        }

        return factorial(n-1) * n;
    }
}
