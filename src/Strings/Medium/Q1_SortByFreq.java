package Strings.Medium;

import java.util.*;

public class Q1_SortByFreq {
    static String sortByFreq(String s){
        Map<Character,Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>(freq.keySet());

        Collections.sort(list,(a, b)->{
            if(!freq.get(a).equals(freq.get(b))){
                return freq.get(b) - freq.get(a);
            }
            return a -b;
        });

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int fre = freq.get(c);
            while(fre-- > 0)
                sb.append(c);
        }
        return sb.toString();
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(sortByFreq(s));
    }
}
