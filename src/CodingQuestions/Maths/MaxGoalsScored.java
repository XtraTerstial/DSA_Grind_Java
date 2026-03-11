package CodingQuestions.Maths;

import java.util.Scanner;

//50
//Lohia-X Gosu-Y Prince-Z
public class MaxGoalsScored {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int goalX = 0, goalY = 0, stopZ = 0;
        while(z > 1){
            if(x%z == 0){
                x--;
                goalX +=1;
            }else if(y%z ==0){
                y--;
                goalY += 1;
            }else{
                z--;
                stopZ +=1;
            }
        }
        System.out.println(goalX+" "+goalY);
    }
}
