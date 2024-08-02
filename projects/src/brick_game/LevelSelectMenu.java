package brick_game;

import javax.swing.*;
import java.awt.*;

public class LevelSelectMenu extends JPanel {
    public LevelSelectMenu(JFrame frame, OptionsMenu optionsMenu) {
        setLayout(new GridLayout(3, 1));

        JButton easyButton = new JButton("Easy");
        easyButton.addActionListener(e -> {
            frame.setContentPane(new Game(frame, 1, optionsMenu));
            frame.revalidate();
        });

        JButton mediumButton = new JButton("Medium");
        mediumButton.addActionListener(e -> {
            frame.setContentPane(new Game(frame, 2, optionsMenu));
            frame.revalidate();
        });

        JButton hardButton = new JButton("Hard");
        hardButton.addActionListener(e -> {
            frame.setContentPane(new Game(frame, 3, optionsMenu));
            frame.revalidate();
        });

        add(easyButton);
        add(mediumButton);
        add(hardButton);
    }
}
