package ch007;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        JLabel nortLabel = new JLabel("Top - North", JLabel.CENTER);
        JLabel southLabel = new JLabel("Bottom - South", JLabel.CENTER);
        JLabel eastLabel = new JLabel("Right - East", JLabel.CENTER);
        JLabel westLabel = new JLabel("Left - West", JLabel.CENTER);
        JLabel centerLabel = new JLabel("Center", JLabel.CENTER);

        nortLabel.setOpaque(true);
        nortLabel.setBackground(Color.BLUE);
        southLabel.setOpaque(true);
        southLabel.setBackground(Color.BLUE);

        eastLabel.setOpaque(true);
        eastLabel.setBackground(Color.ORANGE);
        westLabel.setOpaque(true);
        westLabel.setBackground(Color.ORANGE);
        centerLabel.setOpaque(true);
        centerLabel.setBackground(Color.RED);


        frame.add(nortLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(centerLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }


}
