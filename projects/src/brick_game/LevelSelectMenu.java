package brick_game;

import javax.swing.*;
import java.awt.*;

public class LevelSelectMenu extends JPanel {
    public LevelSelectMenu(JFrame frame, OptionsMenu optionsMenu) {
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Seviye Seçiniz", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 1, 20, 20));
        buttonsPanel.setOpaque(false);

        JButton easyButton = new JButton("Easy");
        easyButton.setFont(new Font("Arial", Font.BOLD, 20));
        easyButton.addActionListener(e -> {
            frame.setContentPane(new Game(frame, 1, optionsMenu));
            frame.revalidate();
        });

        JButton mediumButton = new JButton("Medium");
        mediumButton.setFont(new Font("Arial", Font.BOLD, 20));
        mediumButton.addActionListener(e -> {
            frame.setContentPane(new Game(frame, 2, optionsMenu));
            frame.revalidate();
        });

        JButton hardButton = new JButton("Hard");
        hardButton.setFont(new Font("Arial", Font.BOLD, 20));
        hardButton.addActionListener(e -> {
            frame.setContentPane(new Game(frame, 3, optionsMenu));
            frame.revalidate();
        });

        buttonsPanel.add(easyButton);
        buttonsPanel.add(mediumButton);
        buttonsPanel.add(hardButton);

        add(title, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.CENTER);

        setBackground(Color.DARK_GRAY);
    }
}
