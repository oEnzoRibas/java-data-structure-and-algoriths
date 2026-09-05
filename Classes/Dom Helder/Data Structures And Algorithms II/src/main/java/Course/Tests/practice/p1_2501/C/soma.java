package Course.Tests.practice.p1_2501.C;

public class soma {
    public static void main(String[] args) {
        int a = somador(421);
        System.out.println(a);
    }

    public static int somador(int i){
        if (i == 0){
            return 0;
        }
        return i % 10 + somador(i / 10);
    }
}
