package Algorithms.Recusrion.Important;
//Generate all binary string of length n without consecutive 1's
//Input:
//n = 3
//Output:
//        ["000", "001", "010", "100", "101"]
public class GenerateBinaryStrings {
    static void printBinary(int n, String s){
        int m = s.length();
        if(n==m){
            System.out.print(s+" ");
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printBinary(n, s+0);
            printBinary(n, s+1);
        }
        else printBinary(n, s+0);
    }

    static void main() {
        int n = 3;
        printBinary(n,"");
    }
}
