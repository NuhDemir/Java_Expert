package ch007;

import javax.swing.*;
import java.awt.*;

public class Widget extends JFrame {
    public Widget(){
        this("JShell GUI Widget");
    }
    public Widget(String title){
        super(title);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
    }

    public Component add(Component component){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                getContentPane().add(component);
                getContentPane().doLayout();
            }
        });
        return component;
    }

    public void remove(Component component){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                getContentPane().remove(component);
                getContentPane().doLayout();
                getContentPane().repaint();
            }
        });
    }
    public void reset(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                getContentPane().removeAll();
                getContentPane().doLayout();
                getContentPane().repaint();
            }
        });
    }

}
