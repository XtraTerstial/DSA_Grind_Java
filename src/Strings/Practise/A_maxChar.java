package Strings.Practise;
import java.util.*;

/*Given a String consisting of lowercase English
alphabets. print the character that is occuring most
number of times*/
public class A_maxChar {
    static char maxOccurChar(String s){
        char ch = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int max = 0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                ch = entry.getKey();
            }
        }
        return ch;
    }
    static char maxOccurChar2(String s){
        int n = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)-'a']++;
        }
        int max = 0;
        char maxCh = ' ';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxCh = (char) (i + 'a'); // Use the index 'i' to find the character
            }
        }
        return maxCh;
    }
    public static void main(String[] args) {
        String s = "anagram";
        char ch = maxOccurChar2(s);
        System.out.println(ch);
    }
}
