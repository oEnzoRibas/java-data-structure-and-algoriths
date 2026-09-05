package Course.Lists.L4.Exs.E;

import java.util.Scanner;

public class recursiveSum {
    public static void main(String[] args) {
        Scanner kIn = new Scanner(System.in);

        System.out.println("Digite um numero");
        int a = kIn.nextInt();

        System.out.println(sum(a));
    }

    static int sum(int a){

        if (a == 0) return 0;
        return a % 10 + sum(a / 10);
    }
}
