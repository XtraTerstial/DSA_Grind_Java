package HunderedDays_BootCamp.Day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {
    void main(){
        // ::
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        for(String name : names){
            System.out.println(name);
        }

//        //Lambda Way - 1
//        names.forEach((String name)->{
//            System.out.println(name);
//        });
//
//        //Lambda Way - 2
//        names.forEach((name)-> System.out.println(name));
//
//        //Lambda Way - 3
//        names.forEach((String name)->{
//            System.out.println(name);
//        });
//
        //Method Refernce Way
        names.forEach(System.out::println);
    }
}
