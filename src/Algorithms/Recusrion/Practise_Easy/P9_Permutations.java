package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

//Finding all permutations of a string given all elements of the string are unique
//permutation of n elements is n!
public class P9_Permutations {
    static void printPermutations(String ans, String s){ //T.C is very bad -> O(n!)
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printPermutations(ans+ch,left+right);
        }
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        printPermutations("",s);
    }
}
