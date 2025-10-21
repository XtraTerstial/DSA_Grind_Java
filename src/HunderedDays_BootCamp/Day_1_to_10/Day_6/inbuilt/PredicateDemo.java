package HunderedDays_BootCamp.Day_1_to_10.Day_6.inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    void main(){
        Predicate<Integer> isEven = n -> n%2 == 0;
        System.out.println(isEven.test(10));

        //BiPredicate
        BiPredicate<Integer,Integer> isSumEven = (a,b) -> (a+b)%2 == 0;
        System.out.println(isSumEven.test(5,7));
    }
}
