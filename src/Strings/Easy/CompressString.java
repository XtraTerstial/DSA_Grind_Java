package Strings.Easy;

import java.util.Scanner;

//aaabbbbccdeeeee
//output:- a3b4c2de5
public class CompressString {
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans = "" + s.charAt(0);
        int count = 1;
        for (int i = 1; i <s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr==prev){
                count++;
            } else {
                if(count > 1)
                    ans += count;
                count = 1;
                ans +=curr;
            }
        }
        if(count>1) ans += count;
        System.out.println(s + " after compression is : "+ans);
    }
}
