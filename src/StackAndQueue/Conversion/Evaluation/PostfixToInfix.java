package StackAndQueue.Conversion.Evaluation;
import java.util.*;
public class PostfixToInfix {
    static void main() {
        String postfix = "953+4*6/-";
        System.out.println("Postfix Expression is : " + postfix);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) { // 0 to 9
                String s = "" + ch;
                stack.push(s);
            } else {
                String v2 = stack.pop();
                String v1 = stack.pop();
                String t = "(" + v1 + ch + v2 + ")";
                stack.push(t);
            }
        }
        System.out.println("Infix Expression is : " + stack.peek());
    }
}
