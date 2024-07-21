package ch007;

import javax.swing.*;
import java.awt.*;

public class ProgressDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("swing utilities demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);

        JLabel label = new JLabel("Download Progress", JLabel.CENTER);
        Thread pretender = new Thread(new ProgressPretender(label));
        frame.setVisible(true);
    }
}

class ProgressPretender implements Runnable {
    JLabel label;
    int progress;

    public ProgressPretender(JLabel label) {
        this.label = label;
        progress = 0;
    }

    public void run() {

        while (progress <= 100) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    label.setText(progress + "%");
                }
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                System.err.println("Someone interrupted us.");
                break;
            }
            progress++;
        }

    }

}