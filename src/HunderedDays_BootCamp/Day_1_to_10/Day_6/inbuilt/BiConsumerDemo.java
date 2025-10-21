package HunderedDays_BootCamp.Day_1_to_10.Day_6.inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    void main(){
        BiConsumer<Integer,Integer> addConsumer = (a,b)->System.out.println(a+b);
        addConsumer.accept(3,5);
    }
}
