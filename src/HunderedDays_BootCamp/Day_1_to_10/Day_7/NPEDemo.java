package HunderedDays_BootCamp.Day_1_to_10.Day_7;

import java.util.Optional;

public class NPEDemo  {
    void main() {
        String name = "Devbrat";
        if (name != null)
            System.out.println(name.length());
        else
            System.out.println("No value");

        //Optional
        Optional<String> optionalString = Optional.of("Devbrat");
    }
}
