package Strings.Practise;

import java.util.Arrays;

// input -> devbrat
// output -> abdertv
public class Sorting_A_String {
    static String methodOne(String s){
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return Arrays.toString(ch);
    }
//    static String methodTwo(String s){
//
//    }
    public static void main(String[] args) {
        String s = "devbrat";
        String sort = methodOne(s);
        System.out.println(sort);
    }
}
