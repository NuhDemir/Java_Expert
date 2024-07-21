package ch007;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModalDemo extends JFrame implements ActionListener {
    JLabel modalLabel;

    public ModalDemo() {
        super("Modal dialog");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 600);
        setBackground(Color.ORANGE);

        modalLabel = new JLabel("Press 'Go' to show the popup!", JLabel.CENTER);
        add(modalLabel);

        JButton goButton = new JButton("Go");
        goButton.addActionListener(this);
        add(goButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "We're going!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        modalLabel.setText("Go pressed! Press again if you like");
    }

    public static void main(String[] args) {
        ModalDemo demo = new ModalDemo();
        demo.setVisible(true);
    }
}
