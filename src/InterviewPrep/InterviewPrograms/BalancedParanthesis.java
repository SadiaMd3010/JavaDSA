package InterviewPrep.InterviewPrograms;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String input1 = "(a+b)*(c+d)";
        String input2 = "((a+b)";
        String input3 = "((a+b)*c)";

        System.out.println(input1 + " -> " + isBalanced(input1));
        System.out.println(input2 + " -> " + isBalanced(input2));
        System.out.println(input3 + " -> " + isBalanced(input3));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c=='(') {
                stack.push(c);
            }
            else if(c==')') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
