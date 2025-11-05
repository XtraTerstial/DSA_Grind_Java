package HunderedDays_BootCamp.Day_1_to_10.Day_6.ActionListnerDemo;

import javax.swing.*;

public class ALDemo {
    static void main() {
        JButton button = new JButton("Click Me");
        Runnable task = () -> {
            for (int i = 1; i < 5; i++){
                System.out.println("Running Task");

                try {
                    Thread.sleep(500); //pause for half a second
                }catch(InterruptedException e) {
                    System.out.println("Task Interrupted: "+ e.getMessage());
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();


        //Using Lambda exp
        button.addActionListener(e -> System.out.println("Button Clicked!"));

        JFrame frame = new JFrame();
        frame.add(button);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
