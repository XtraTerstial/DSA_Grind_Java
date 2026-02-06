package CodingQuestions.Maths.Conversion;

public class DecimalToHexaDecimal {
    static String decimalToHexaDecimal(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int temp = num % 16;
            if(temp<10){
                sb.append((char)(temp+48));
            }else{
                sb.append((char)(temp+55));
            }
            num = num/16;
        }
        return sb.toString();
    }
    static void main(){
        int n = 255;
        String s = decimalToHexaDecimal(n);
        System.out.println(s);
    }
}