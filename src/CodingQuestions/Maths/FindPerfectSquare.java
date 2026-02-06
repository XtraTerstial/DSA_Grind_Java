package CodingQuestions.Maths;

import java.util.Scanner;

public class FindPerfectSquare {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long low = 0, high = n;

        boolean flag = false;
        while(low<=high){
            long mid = low + (high-low) / 2;
            long sq = mid*mid;
            if(sq == n){
                flag = true;
                break;
            }
            else if(sq < n) low = mid+1;
            else high = mid - 1;
        }
        if(flag) System.out.println("Perfect Square");
        else System.out.println("Not perfect Square");
    }
}
