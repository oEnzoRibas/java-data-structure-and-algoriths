package Course.Lists.L4.Exs.C;

public class recursiveDivider {
    public static void main(String[] args) {
        System.out.println(divide(0,5));
    }
    public static int divide(int a, int b) throws IllegalArgumentException{
        if (b == 0){
            throw new IllegalArgumentException("Erro! Divisão por zero não é permitida!");
        }
        if (a < b) return 0;
        return 1 + divide(a-b, b);
    }
}
