package Course.Lists.L1.Exs.H;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static void main(String[] args) {
        String email, result;
        Scanner kIn = new Scanner(System.in);

        System.out.println("Enter an email");
        email = kIn.nextLine();

        result = emailValidator(email)? "Valid!" : "Not valid!";
        System.out.println(result);
    }


    public static boolean emailValidator(String emailString){
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]$";


        Pattern regexPattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexPattern.matcher(emailString);

        return matcher.matches();
    }
}
