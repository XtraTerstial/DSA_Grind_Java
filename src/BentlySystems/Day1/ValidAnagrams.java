package BentlySystems.Day1;

import java.util.*;

public class ValidAnagrams {
    public static boolean valid(String a, String b) {
        if(a.length() != b.length()) return false;
        int[] freq = new int[26];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<=a.length();i++){
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }
        for(int count : freq) {
            if(count != 0) return false;
        }
        return true;
    }
}
