package brick_game;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        OptionsMenu optionsMenu = new OptionsMenu(frame);

        frame.setContentPane(new MainMenu(frame, optionsMenu));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
