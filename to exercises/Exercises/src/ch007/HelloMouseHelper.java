package ch007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;

public class HelloMouseHelper {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);

        JLabel label= new JLabel("Mouse",JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.ORANGE);
        label.setSize(100,50);
        label.setLocation(100,100);
        frame.add(label);

        LabelMover mover = new LabelMover(label);
        frame.getContentPane().addMouseListener(mover);
        frame.setVisible(true);
    }

}

class LabelMover extends MouseAdapter {
    JLabel labelToMove;

    public LabelMover(JLabel label){
        labelToMove=label;
    }

    public void mouseClicked(MouseEvent event){
        labelToMove.setLocation(event.getX(),event.getY());
    }
}