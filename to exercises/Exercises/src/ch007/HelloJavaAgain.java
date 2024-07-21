package ch007;

import javax.swing.*;

public class HelloJavaAgain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello,JAVA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,500);

        JLabel label = new JLabel("Hello-java");
        frame.add(label);
        frame.setVisible(true);
    }
}
