package ch007;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class NestedPanelDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);


        JTextArea messageArea = new JTextArea();
        frame.add(messageArea, BorderLayout.CENTER);



    }
}
