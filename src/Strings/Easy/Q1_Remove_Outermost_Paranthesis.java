package Strings.Easy;

public class Q1_Remove_Outermost_Paranthesis {
    static String removeParan(String s){
        int n = s.length();
        int count = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == ')') count--;
            if(count != 0){
                str.append(ch);
            }
            if(ch == '(') count++;
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "(()()())";
        String ans = removeParan(s);
        System.out.println(ans);
    }
}
