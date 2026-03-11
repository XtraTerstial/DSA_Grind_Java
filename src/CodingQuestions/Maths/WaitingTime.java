package CodingQuestions.Maths;

import java.util.Scanner;

//46
public class WaitingTime {
    static int waitingTimeOfLastPatient(int patient, int interval){
        if(patient == 1) return 0;
        return (10-interval) * (patient-1);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int patient = in.nextInt();
        int interval = in.nextInt();
        System.out.println(waitingTimeOfLastPatient(patient, interval));
    }
}
