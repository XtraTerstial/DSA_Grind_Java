package HunderedDays_BootCamp.Day_1_to_10.Day_5;

public class JavaExceptionHandling {
    void main(){
        int[] arr = {1,2,3,4,5};
        try{
            //exception generating statement
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            //exception handling statement
            IO.println("Exception : "+e);
        }
    }
}
