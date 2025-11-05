package HunderedDays_BootCamp.Day_1_to_10.Day_6;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterfacePractise {
    static void main() {
        Scanner in =new Scanner(System.in);
        Function<Integer,Integer> multiply = (a) -> a*5; //take one input and return one output
        Function<Integer,Integer> add = (a) -> a+5; //take one input and return one output
        System.out.println("Fuction Interface Demo: "+ multiply.apply(4));

        Function<String, String> toUpperCase = (str)-> str.toUpperCase();
        System.out.println("To Upper Case: "+ toUpperCase.apply("hello"));

        //Function Chaining
        Function<Integer, Integer> combineFunction = multiply.andThen(add);
        System.out.println("Function Chaining Result: "+ combineFunction.apply(3));

        Consumer<String> print = System.out::println;
        print.accept(String.valueOf(5+2));

        BiConsumer<String, Integer> printNameAge = (name, age) ->{
            System.out.println("Name is " + name + " and age is " + age);
        };
        String n = in.nextLine();
        int age = in.nextInt();
        printNameAge.accept(n, age);
    }
}
