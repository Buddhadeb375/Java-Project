package BAPUJAVA;
import java.awt.*;

public class Traffic_Light {
    public static void main(String[] args) {
        Frame f = new Frame("Traffic Light Simulation");
        f.setResizable(false);

        // Create Labels
        Label red = new Label(" RED ", Label.CENTER);
        Label yellow = new Label(" YELLOW ", Label.CENTER);
        Label green = new Label(" GREEN ", Label.CENTER);

        // Set font
        Font font = new Font("Arial", Font.BOLD, 24);
        red.setFont(font);
        yellow.setFont(font);
        green.setFont(font);

        // Add labels in a grid
        f.setLayout(new GridLayout(3, 1));
        f.add(red);
        f.add(yellow);
        f.add(green);

        f.setSize(300, 400);
        f.setVisible(true);

        // NUmber of times it will simulate
        int i=0;
        while (i<1) {
            try {
                // Red ON
                red.setBackground(Color.RED);
                yellow.setBackground(Color.GRAY);
                green.setBackground(Color.GRAY);
                Thread.sleep(2000);

                // Yellow ON
                red.setBackground(Color.GRAY);
                yellow.setBackground(Color.YELLOW);
                green.setBackground(Color.GRAY);
                Thread.sleep(1000);

                // Green ON
                red.setBackground(Color.GRAY);
                yellow.setBackground(Color.GRAY);
                green.setBackground(Color.GREEN);
                Thread.sleep(2000);
                i++;
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
