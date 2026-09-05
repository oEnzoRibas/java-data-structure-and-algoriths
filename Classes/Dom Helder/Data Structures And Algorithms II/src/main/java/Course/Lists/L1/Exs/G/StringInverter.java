package Course.Lists.L1.Exs.G;

import java.util.Scanner;

public class StringInverter {
    public static void main(String[] args) {
        String s;
        Scanner kIn = new Scanner(System.in);

        System.out.println("Write a sentence");
        s = kIn.nextLine();


        System.out.println(stringInverter(s));
    }
    public static String stringInverter(String s){
        char[] chars = s.toCharArray();
        int leftPointer = 0, rightPointer = s.length() -1;

        while (leftPointer < rightPointer){
            char temp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
        return new String(chars);
    }
}
