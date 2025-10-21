package HunderedDays_BootCamp.Day_6.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    public static BiFunction<Integer,Integer, Integer> addBiFunc = (a,b)-> a+b;
//    public static BiFunction<Integer,Integer, Integer> addBiFunc = Integer::sum;

    public static BiFunction<Integer,Integer, Integer> subtractBiFunc = (a,b)-> a-b;

    //Chaining
    public static Function<Integer,Integer> multiplyBy2 = (a)-> a*2;
    public static BiFunction<Integer,Integer,Integer> combineBiFunc = addBiFunc.andThen(multiplyBy2);

    void main(){
        System.out.println(addBiFunc.apply(3,5));
        System.out.println(subtractBiFunc.apply(3,5));
    }
}
