package HunderedDays_BootCamp.Day_1_to_10.Day_6.inbuilt;

import java.util.function.Supplier;

public class SupplierDemo {
    void main(){

        //Generate Random Number
//        Supplier<Double> randomNum = ()-> Math.random();
        Supplier<Double> randomNum = Math::random;
        System.out.println(randomNum.get());
    }
}
