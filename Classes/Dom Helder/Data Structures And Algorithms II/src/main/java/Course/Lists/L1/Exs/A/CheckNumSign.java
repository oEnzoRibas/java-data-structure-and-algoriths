package Course.Lists.L1.Exs.A;

import java.util.Scanner;

public class CheckNumSign {
    public static void main(String[] args) {
        double num;
        Scanner kIn = new Scanner(System.in);

        System.out.println("Write a number");
        num = kIn.nextDouble();
        System.out.println(checkNumSign(num));
    }

    public static String checkNumSign(double n) {
        String result;

        if (n == 0) result = "Zero";
        else if (n < 0) result = "Negative";
        else result = "Positive";
        return "The number is " + result;
    }
}
