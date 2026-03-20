package CodingQuestions.Maths;

import java.util.Scanner;
//Prime check: O(√n)
//Square root: O(1)
//Overall: O(√n) → optimal for single number input.

//Check if a number is prime or not and if prime print it's sq root to 2 decimal place
public class Q4_PrimeOrNot {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a <= 1) {
            System.out.println("Not a prime number");
            return;
        }

        boolean isPrime = true;
        int sqrt = (int)Math.sqrt(a);
        for (int i = 2; i <= sqrt; i++) {
            if(a%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(a+" is a prime number");
            System.out.printf("%.2f", Math.sqrt(a));
        } else{
            System.out.println("Not a prime Number");
        }
    }
}
