package ch007;

import javax.swing.*;
import java.awt.*;

public class Labels {

    static final String PROJECT_PATH = "/Users/EvAn/Desktop/Github/4-Java/Java_Expert/to exercises/Exercises/src/ch007";

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);

        JLabel basic = new JLabel("Default Label");
        basic.setOpaque(true);
        basic.setBackground(Color.YELLOW);
        JLabel another = new JLabel("Another Label");
        another.setOpaque(true);
        another.setBackground(Color.GREEN);
        JLabel simple = new JLabel("A Simple Label");
        simple.setOpaque(true);
        simple.setBackground(Color.WHITE);
        JLabel standard = new JLabel("A Standard Label");
        standard.setOpaque(true);
        standard.setBackground(Color.ORANGE);
        JLabel centered = new JLabel("Centered Text", JLabel.CENTER);
        centered.setPreferredSize(new Dimension(150, 24));
        centered.setOpaque(true);
        centered.setBackground(Color.WHITE);
        JLabel times = new JLabel("Times Roman");
        times.setOpaque(true);
        times.setBackground(Color.WHITE);
        times.setFont(new Font("TimesRoman", Font.BOLD, 18));
        JLabel styled = new JLabel("<html>Some <b><i>styling</i></b> is also allowed</html>");
        styled.setOpaque(true);
        styled.setBackground(Color.WHITE);
        JLabel icon = new JLabel("Verified", new ImageIcon(PROJECT_PATH + "/ch10/check.png"), JLabel.LEFT);
        icon.setOpaque(true);
        icon.setBackground(Color.WHITE);

        frame.add(basic);
        frame.add(another);
        frame.add(simple);
        frame.add(standard);
        frame.add(centered);
        frame.add(times);
        frame.add(styled);
        frame.add(icon);

frame.add(basic);
        frame.setVisible( true );
    }
}
