package HunderedDays_BootCamp.Day_6.inbuilt;

import javax.swing.*;
import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static Function<Integer,Integer> addFunction = (a) -> a+3;
    public static Function<Integer,Integer> subtractFunction = (a) -> a-7;

    //chaining or combining both function
    public static Function<Integer, Integer> combineFUnction =
            addFunction.andThen(subtractFunction);

    void main(){
        System.out.println(addFunction.apply(10));

//        System.out.println();
//
//        IO.println(addFunction.apply(2));

        //Subtract Function
        IO.println(subtractFunction.apply(10) + " and " + subtractFunction.apply(1));

        System.out.println(combineFUnction.apply(13));
    }
}
