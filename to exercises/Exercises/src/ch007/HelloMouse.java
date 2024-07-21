package ch007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HelloMouse extends JFrame implements MouseListener {
    JLabel label;

    public HelloMouse() {
        super("Mouse event demo:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300, 100);

        label = new JLabel("Hello,MOUSE", JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setSize(100, 20);
        label.setLocation(100, 100);
        add(label);

        getContentPane().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setLocation(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        HelloMouse frame = new HelloMouse();
        frame.setVisible(true);
    }
}
