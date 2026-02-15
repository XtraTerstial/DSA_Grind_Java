package CodingQuestions.Maths;

public class NthFiboTerms {
    static int fiboTerm(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fiboTerm(n-1) + fiboTerm(n-2);
    }
    //Using dp
    static int nthFibonacci(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = nthFibonacci(n-1, dp) + nthFibonacci(n-1, dp);
    }
    //iterative //USE This
    static int nthFibonacci(int n){
        if(n<=1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {

        System.out.println(nthFibonacci(9));

    }
}
