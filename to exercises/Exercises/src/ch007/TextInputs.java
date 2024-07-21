package ch007;

import javax.swing.*;
import java.awt.*;

public class TextInputs {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField(10);
        JLabel emailLabel = new JLabel("Email: ");
        JTextField emailField = new JTextField(24);

        JLabel bodyLabel = new JLabel("Body: ");
        JTextArea bodyArea = new JTextArea(10,40);
        bodyArea.setLineWrap(true);
        bodyArea.setWrapStyleWord(true);
        JScrollPane bodyScroller = new JScrollPane(bodyArea);
        bodyScroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        bodyScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailField);
        frame.add(emailLabel);
        frame.add(bodyLabel);
        frame.add(bodyScroller);

        frame.setVisible(true);

    }
}
