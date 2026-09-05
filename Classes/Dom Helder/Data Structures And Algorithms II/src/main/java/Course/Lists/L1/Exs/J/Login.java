package Course.Lists.L1.Exs.J;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String password;
        boolean isValid;
        Scanner kIn = new Scanner(System.in);

        do {
            System.out.println("Enter password");
            password = kIn.nextLine();
            isValid = passwordChecker(password);
            if (!isValid) System.out.println("Wrong password!");
        } while (!isValid);

        System.out.println("Open door");
    }

    public static boolean passwordChecker(String pw){
        String pass = "alpha";
        return pw.equals(pass);
    }
}
