package ch007;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class NestedPanelDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);


        JTextArea messageArea = new JTextArea();
        frame.add(messageArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 0));
        JButton sendButton = new JButton("Send");
        JButton saveButton = new JButton("Save");
        JButton resetButton = new JButton("Reset");
        JButton cancelButton = new JButton("Cancel");


        buttonPanel.add(sendButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(cancelButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);

    }
}
