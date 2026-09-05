package Course.Tests.practice.p2_2502.B;

import Course.Tests.practice.p2_2502.Stack;

public class ConversaoBase {
    protected static void converteBase(int n, int base){
        Stack<Integer> stk = new Stack<>();
        if (n == 0){
            stk.push(n);
        }
        while(n > 0){
            int dig = n % base;
            stk.push(dig);
            n = n / base;
        }
        stk.showStack();
    }

    public static void main(String[] args) {
        converteBase(256, 2);
    }
}
