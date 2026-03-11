package CodingQuestions.Strings;

import java.util.Scanner;

//iAmDevbrat - 3
//Count no of words in sentence
public class ConutWordsInCamelCase {
    static int countWords(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){
                count++;
            }
        }
        return count+1;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(countWords(s));
    }
}
