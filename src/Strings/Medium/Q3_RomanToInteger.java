package Strings.Medium;

import java.util.*;

public class Q3_RomanToInteger {
    static int romanToInteger(String s){
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length()-1; i++){
            char c = s.charAt(i);
            if(map.get(c) < map.get(s.charAt(i+1))){
                res -= map.get(c);
            }else{
                res += map.get(c);
            }
        }
        return res + map.get(s.charAt(s.length()-1));
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(romanToInteger(s));
    }
}
