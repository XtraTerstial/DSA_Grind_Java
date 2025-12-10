package StackAndQueue.Conversion;

import java.util.*;

public class InfixToPrefix {
    static void main() {
        String infix = "9-(5+3)*4/6"; //
        System.out.println("Infix Expression is : " + infix);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0; i< infix.length(); i++) {
            char ch = infix.charAt(i);
            //character to integer conversion
            int ascii = (int) ch;
            //0 -> 48 || 9 -> 57
            if (ascii >= 48 && ascii <= 57){// 0 to 9
                String s = "" + ch;
                val.push(s);
            }
                //Check for operands and brackets
            else if (op.isEmpty() || ch == '(' || op.peek() == '(')
                op.push(ch);

            else if (ch == ')') {
                while (op.peek() != '(') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop(); // o -> operator
                    //main logic
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop(); // '(' hata do
            } else {
                if (ch == '+' || ch == '-') {
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop(); // o -> operator
                    String t = o + v1 + v2;
                    val.push(t);
                    //push
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        //work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop(); // o -> operator
                        String t = o + v1 + v2;
                        val.push(t);
                        //push
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        // val stack -> 1
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop(); // o -> operator
            String t = o + v1 + v2;
            val.push(t);
        }
        System.out.println("After conversion to prefix : "+val.peek());
    }
}
