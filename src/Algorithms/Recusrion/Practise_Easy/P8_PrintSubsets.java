package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;
//Print Subsets of a String with the unique characters
//subsets of n elements is -> 2^n
public class P8_PrintSubsets {
    static void printAllSubsets(int  i, String s, String ans){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(i);
        printAllSubsets(i+1,s,ans+ch);//take
        printAllSubsets(i+1,s,ans);//not take
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        printAllSubsets(0, s, "");
    }
}
