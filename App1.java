package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App1 extends JFrame {
    int counter = 0;

    public App1() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 300);

        Font font = new Font("Arial", Font.BOLD, 30);

        JTextField counterText = new JTextField("Генератор");
        add(counterText, BorderLayout.CENTER);
        counterText.setFont(font);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);

        counterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterText.setText(generateData());

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        App1 app = new App1();

    }

    public String generateData() {
        Random random = new Random();
        return "8999" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10) + random.nextInt(10) + random.nextInt(10)
                + random.nextInt(10);

    }


}
