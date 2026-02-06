package CodingQuestions.Maths.Conversion;

public class DecimalToOctal {
    static int decimalToOctal(int num) {
        int binary = 0;
        int i = 1;
        for (int j = num; j > 0 ; j/=8) {
            binary = binary + (num%8)*i;
            i*=10;
            num/=8;
        }
        return binary;
    }
    public static void main(String [] args) {
        int n = 10;
	System.out.println(decimalToOctal(n));
    }
}
