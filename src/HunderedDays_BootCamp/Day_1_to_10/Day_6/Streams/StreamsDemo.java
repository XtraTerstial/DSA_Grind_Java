package HunderedDays_BootCamp.Day_1_to_10.Day_6.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    void main(){
        List<String> fruits = Arrays.asList("Apple","Banana","Pineapple");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        //Using Stream
        Stream<String> stream = fruits.stream();
        stream.forEach(System.out::println);

        //Filter :- fruit starting with letter B
        Stream<String> streamNew = fruits.stream();
        Stream<String> filteredStream = streamNew.filter(name -> name.startsWith("B"));
        filteredStream.forEach(System.out::println);
    }
}
/*
* Use Cases
* 1. Filtering
* 2. Mapping
* 3. Aggregation
* 4. Searching
* 5. Iteration
*
*
*
* */