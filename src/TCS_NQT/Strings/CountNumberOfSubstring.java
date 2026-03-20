package TCS_NQT.Strings;

import java.util.*;

public class CountNumberOfSubstring {
    static int atMostKDistinct(String s, int k){
        int n = s.length();
        int left = 0, res = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for(int right = 0; right < n ; right++){
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0)+1);

            while(freq.size() > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) == 0) freq.remove(leftChar);
                left++;
            }

            res += (right-left+1);
        }
        return res;
    }
    static int countSubstrings(String s, int k){
        if(k == 0) return atMostKDistinct(s, -1);
        return atMostKDistinct(s, k) - atMostKDistinct(s, k-1);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        System.out.println(countSubstrings(s, k));
    }
}
