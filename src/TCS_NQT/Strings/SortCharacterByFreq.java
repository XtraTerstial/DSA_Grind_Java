package TCS_NQT.Strings;

import java.util.*;

class Solution {
     String sortCharByFreq(String s){
        Pair[] freq = new Pair[26];
        for(int i = 0; i< 26; i++){
            freq[i] = new Pair(0, (char)(i+'a'));
        }
        for(char c : s.toCharArray()){
            freq[c-'a'].freq++;
        }
        Arrays.sort(freq, ( p1, p2)->{
            if(p1.freq != p2.freq) return p2.freq - p1.freq;
            else return p1.c - p2.c ;
        });

        StringBuilder sb = new StringBuilder();
        for(Pair p : freq){
            for(int i = 0; i < p.freq; i++ )
                sb.append(p.c);
        }
        return sb.toString();
    }
     class Pair{
        char c;
        int freq;
        Pair(int freq, char c){
            this.freq = freq;
            this.c = c;
        }
    }
}
public class SortCharacterByFreq {
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        Solution sol = new Solution();

        String sort = sol.sortCharByFreq(s);
        System.out.println(sort);
    }
}
