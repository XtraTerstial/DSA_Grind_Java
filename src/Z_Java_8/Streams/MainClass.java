package Z_Java_8.Streams;

import java.util.List;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {

        //Older way
        /*Walkable obj = new WalkFast();
        obj.walk(4);*/

        //new way using Lambda Expression
//        Walkable obj = (steps, isEnabled) -> {
//            System.out.println("Walking fast for " + steps + " steps.");
//            return steps * 2; // Walking fast doubles the steps
//        };

        List<String> fruits = List.of("Apple", "Banana", "Kiwi");

        Stream<String> stream = fruits.stream();
//        stream.forEach((fruit)-> {
//            System.out.println(fruit);
//        });

        stream
                .sorted()
                .map(fruit -> fruit.length())
                .forEach(fruit-> System.out.println(fruit));

    }
}
interface Walkable{
    int walk(int steps, boolean isEnabled);
}

/*class WalkFast implements Walkable{

    public int walks(int steps) {
        System.out.println("Walking fast for " + steps + " steps.");
        return steps * 2; // Walking fast doubles the steps
    }

    @Override
    public int walk(int steps) {
        return 0;
    }
}*/
