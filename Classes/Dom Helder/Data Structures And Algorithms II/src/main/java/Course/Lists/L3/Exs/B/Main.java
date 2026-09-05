package Course.Lists.L3.Exs.B;

public class Main {

    public static double divisao (int a, int b) throws DivideByZero {
        if (b == 0){throw new DivideByZero();}
        return (double) a / b;
    }

    public static void main(String[] args) {
        try {
            double d = divisao(4, 0);
            System.out.println(d);
        }catch (DivideByZero ex){
            System.out.println(ex.getMessage());
        }
    }
}
