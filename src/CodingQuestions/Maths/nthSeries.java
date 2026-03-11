package CodingQuestions.Maths;

import java.util.Scanner;

//2, 10, 30, 68, 130
public class nthSeries {

    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n*n*n + n);
        for(int i = 1;i<=n;i++){
            int sum = i*i*i + i;
            System.out.print(sum+", ");
        }
    }
}
