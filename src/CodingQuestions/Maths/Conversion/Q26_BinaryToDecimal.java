package CodingQuestions.Maths.Conversion;

public class Q26_BinaryToDecimal {
    static int binary2Decimal(int n){
        int dec_value = 0;
        int power = 0;
        while(n!=0){
            int bit = n%10;
            dec_value += (int) (bit * Math.pow(2,power));
            power++;
            n=n/10;
        }
        return dec_value;
    }
    static int binaryToDecimal(String binary) {
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        return decimal;
    }

    static void main() {
        String s = "1010";
        System.out.println(binaryToDecimal(s));
    }
}
