package Strings.Easy;

import java.util.*;
public class SOS_SignalDistortion {
    void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message Received");
        String mes = in.nextLine();
        String s = "SOS";
        int cnt = 0;
        for(int i=0;i<mes.length();i++){
            char ch = mes.charAt(i);
            char ch1 = s.charAt(i%3);
            if(ch != ch1) cnt++;
            else continue;
        }
        IO.println("Distorted words are "+cnt);
    }
}
