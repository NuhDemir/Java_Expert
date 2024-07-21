package ch007;

import javax.swing.*;
import java.awt.*;

public class Buttons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        JButton basic = new JButton("Try Me!");
        frame.add(basic);

        frame.setVisible(true);
    }
}
