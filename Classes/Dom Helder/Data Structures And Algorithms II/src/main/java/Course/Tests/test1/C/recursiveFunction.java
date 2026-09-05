package Course.Tests.test1.C;

public class recursiveFunction {

    private static double function(double n){

        double term = (double) n / (n+1);

        if (n % 2 != 0) {
                term *= -1;
        }

        if (n == 1){
            return 0.5;
        }

        return term + function(n-1);
    }
}
