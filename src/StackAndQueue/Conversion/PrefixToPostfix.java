package StackAndQueue.Conversion;
import java.util.*;
public class PrefixToPostfix {
    static void main() {
        String prefix = "-9/*+5346";
        System.out.println("Prefix Expression is : " + prefix);
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) { // 0 to 9
                String s = "" + ch;
                stack.push(s);
            } else {
                String v1 = stack.pop();
                String v2 = stack.pop();
                String t = v1 + v2 + ch;
                stack.push(t);
            }
        }
        System.out.println("Postfix Expression is : " + stack.peek());
    }
}
