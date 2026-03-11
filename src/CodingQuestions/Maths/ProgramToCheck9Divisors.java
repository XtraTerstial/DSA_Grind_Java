package CodingQuestions.Maths;

import java.util.Scanner;

//Eg:- 36, 100 has exactly 9 divisors
public class ProgramToCheck9Divisors {
    static int countDiv(int n){
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0) count++;
        }
        return count;
    }
    static void count9Divisors(int n){
        int cnt = 0;
        for(int i = 1; i<=n;i++){
            if(countDiv(i) == 9){
                System.out.print(i+" ");
                cnt += 1;
            }
        }
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int range = in.nextInt();
        count9Divisors(range);
    }
}
