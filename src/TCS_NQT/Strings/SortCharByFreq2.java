package TCS_NQT.Strings;

import java.util.*;

public class SortCharByFreq2 {
    static String sortByFreq(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b)->{
            if(!map.get(a).equals(map.get(b)))
                return map.get(b) - map.get(a);
            return a - b;
        });
        StringBuilder a = new StringBuilder();
        for(char c : list){
            int freq = map.get(c);
            while(freq > 0){
                a.append(c);
                freq--;
            }
        }
        return a.toString();
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(sortByFreq(s));
    }
}
