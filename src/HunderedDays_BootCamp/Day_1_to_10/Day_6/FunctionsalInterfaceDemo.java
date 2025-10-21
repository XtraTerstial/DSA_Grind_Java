package HunderedDays_BootCamp.Day_1_to_10.Day_6;

@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

// parameter -> expression body
// () -> {}

public class FunctionsalInterfaceDemo {
    void main() {
        // STEP - 1
        BookAction bookAction1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action-1 performed");
            }
        };
        bookAction1.perform();

        //STEP - 2
        BookAction bookAction2 = () -> {
            System.out.println("Action-2 Performed");
        };

        //STEP -3
        BookAction bookAction3 = () -> System.out.println("Action-3 Performed");
        bookAction3.perform();

        //Functional Interface with parameter
        //1st - way
        Operation operation1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(operation1.add(10,20));

        //2nd - way
        Operation operation2 = (int a, int b) -> a + b;
    }
}
