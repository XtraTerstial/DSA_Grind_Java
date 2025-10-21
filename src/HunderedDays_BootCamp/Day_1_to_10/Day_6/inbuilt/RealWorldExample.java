package HunderedDays_BootCamp.Day_1_to_10.Day_6.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealWorldExample {
    void main(){
        //FORMAT WE WANT TO PRINT -> <title> costs $<price>
        BiFunction<String,Double,String> formatter = (title, price)-> title + " book cost $" + price;
        System.out.println(formatter.apply("Java Basics",9.99));

        //Consumer
        BiConsumer<String,Double> formatterConsumer = (title, price)-> System.out.println(title + " book cost $" + price);
        formatterConsumer.accept("C Basics", 7.99);

        //isExpensive(Predicate)
        Predicate<Double> isExpensive = (price) -> price > 50;
        if(isExpensive.test(18.99)){
            System.out.println("Expensive");
        }
        else System.out.println("Reasonable value");
    }
}
