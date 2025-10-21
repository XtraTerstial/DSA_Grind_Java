package HunderedDays_BootCamp.Day_1_to_10.Day_6.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineDemo {
    void main(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //LIST: EVEN NUMBER from "numbers" list

        //Iteration 1 -> Without Using Streams
        List<Integer> evenNumbers1 = new ArrayList<>();
        for(int num : numbers) {
            if (num % 2 == 0)
                evenNumbers1.add(num);
        }
        System.out.println("Even Numbers Without Using Streams : ");
        System.out.println(evenNumbers1);

        System.out.println();

        //Iteration 2 -> Using Streams
        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p);
        List<Integer> evenNumbers2 = integerStream2.toList();
        System.out.println("Even Numbers With Using Streams 1: ");
        System.out.println(evenNumbers2);

        System.out.println();

        //iteration 3
        List<Integer> evenNumbers3 = numbers.stream()
                .filter(num -> num%2 == 0)
                .toList();
        System.out.println("Even Numbers With Using Streams 2: ");
        System.out.println(evenNumbers3);

        //Array Stream
        int[] numberArray = {1,2,3,4,5,6,7,8,9};
        Stream<Integer> arrayStream = Arrays.stream(numberArray).boxed();
        arrayStream.forEach(System.out::print);
    }

    static Predicate<Integer> p = (a) -> a % 2 == 0;
}
