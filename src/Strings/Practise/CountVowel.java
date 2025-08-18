package Strings.Practise;

import java.util.Scanner;

public class CountVowel {
    static int countVowels(String s){
        s.toLowerCase();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(countVowels(s));
    }
}
