package HunderedDays_BootCamp.Day_1_to_10.Day_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    void main(){
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15);
        // reduce()
        //1st way
        Stream<Integer> integerStream = numbers.stream();
        int sum = integerStream.reduce(0,(acc,num) -> acc+num); //acc - accumulator
//        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("Sum: "+sum);

        //2nd way
        int total = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("Sum: "+total);

        //collect()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n-> n%2 == 0)
                .collect(Collectors.toList());
        System.out.println("EvenNumbers: "+evenNumbers);

        //find & match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has14 = numbers.stream().anyMatch(n -> n == 14);
        System.out.println("Has 14 : " +has14);

        //Iteration
        numbers.stream()
                .forEach(System.out::println);
    }
}
