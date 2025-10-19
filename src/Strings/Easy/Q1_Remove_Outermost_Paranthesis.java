package Strings.Easy;

import java.util.*;

public class Q1_Remove_Outermost_Paranthesis {
//    static String removeParan(String s){
//        int n = s.length();
//        int count = 0;
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if(ch == ')') count--;
//            if(count != 0){
//                str.append(ch);
//            }
//            if(ch == '(') count++;
//        }
//        return str.toString();
//    }
//    public static void main(String[] args) {
//        String s = "(()()())";
//        String ans = removeParan(s);
//        System.out.println(ans);
//    }

    static String removeBrackets(String s){
        StringBuilder str = new StringBuilder();
        int n = s.length();
        int cnt = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == ')') cnt--;
            if(cnt != 0){
                str.append(ch);
            }
            if(ch == '(') cnt++;
        }
        return str.toString();
    }
    void main(){
        Scanner in = new Scanner(System.in);
        IO.println("Enter the Parenthesis to be checked");
        String s = in.nextLine();
        String str = removeBrackets(s);
        IO.println(str);
    }
}
