package Course.Lists.L1.Exs.D;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String sentence, result;

        Scanner kIn = new Scanner(System.in);

        System.out.println("Write down a sentence");
        sentence = kIn.nextLine();

        result = (isPalindrome(sentence) ? "The sentence is a palindrome" : "The sentence is not a palindrome");

        System.out.println(result);

    }

    private static boolean isPalindrome(String sentence){
        int leftPointer = 0, rightPointer = sentence.length()-1;

        sentence = sentence.toLowerCase();

        while (leftPointer < rightPointer){
            if (sentence.charAt(leftPointer) != sentence.charAt(rightPointer)){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
