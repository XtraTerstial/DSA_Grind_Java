package Strings.Easy;
/*Input: s = "anagram", t = "nagaram"
Output: true*/

import java.util.*;
public class Q7_ValidAnagram {
    static boolean checkAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "snagram";
        String t = "nagarsm";
        boolean flag = checkAnagram(s, t);
        if(flag)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
