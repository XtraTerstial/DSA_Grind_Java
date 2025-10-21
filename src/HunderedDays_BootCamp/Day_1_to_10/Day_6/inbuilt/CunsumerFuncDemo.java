package HunderedDays_BootCamp.Day_1_to_10.Day_6.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CunsumerFuncDemo {
    void main(){
//        Consumer<String> consumer1 = (str)-> System.out.println(str);
        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = str -> System.out.println(str.length());
        consumer1.accept("Hello, Dear!");
        consumer2.accept("Hello");

        //Real world Example
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> multiplyByTwo = n -> System.out.println("n*2");
        numbers.forEach(multiplyByTwo);
    }
}
