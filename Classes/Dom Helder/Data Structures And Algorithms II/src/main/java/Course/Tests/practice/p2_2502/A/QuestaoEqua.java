package Course.Tests.practice.p2_2502.A;


import Course.Tests.practice.p2_2502.Stack;

public class QuestaoEqua {
    static Stack<Character> stk = new Stack<>();

    private static boolean validate(String s) {

        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stk.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char topo = stk.pop();

                if ((c == ')' && topo != '(') ||
                        (c == ']' && topo != '[') ||
                        (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) {

        String s = "1*2(3+{4/5}}";

        for (int i = 0; i < s.length(); i++) {
            stk.push(s.charAt(i));
        }

        System.out.println(validate(s));


    }
}
