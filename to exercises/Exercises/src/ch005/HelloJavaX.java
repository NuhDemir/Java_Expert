package ch005;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class HelloJavaX extends JFrame {
    public static void main(String[] args) {
        HelloJavaX demo = new HelloJavaX();
        demo.setVisible(true);
    }

    public HelloJavaX() {
        super("HelloJavaX");
        add(new HelloComponentX("Hello,Inner Java"));
    }

    class HelloComponentX extends JComponent {
        String theMessage;
        int messageX = 125, messageY = 95; // Coordinates of the message

        public HelloComponentX(String message) {
            theMessage = message;
            addMouseMotionListener(new MouseMotionListener() {
                public void mouseDragged(MouseEvent e) {
                    messageX = e.getX();
                    messageY = e.getY();
                    repaint();
                }

                public void mouseMoved(MouseEvent e) {
                }
            });
        }

        public void paintComponent(Graphics g) {
            g.drawString(theMessage, messageX, messageY);
        }
    }
}