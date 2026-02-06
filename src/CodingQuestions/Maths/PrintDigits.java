package CodingQuestions.Maths;

public class PrintDigits {
    static void main() {
        int n = 3870100;

        int rev = 0;
        int temp = n;

        while(temp != 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        while(rev!=0){
            System.out.print(rev%10+" ");
            rev = rev/10;
        }
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
