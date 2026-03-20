package TCS_NQT.Strings;

import java.util.Scanner;

public class LongestPalindromicSubString {
    static boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int max = 0;
        int start = 0, end = 0;

        for(int i=0;i<s.length();i++){

            for (int j = i; j < s.length(); j++) {
                if(isPalindrome(s, i, j)){
                    int len = j-i+1;
                    if(len > max){
                        max = len;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        System.out.println(s.substring(start, end+1));
    }
}
