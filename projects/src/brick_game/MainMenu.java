package brick_game;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JPanel {

    private JFrame frame;
    private OptionsMenu optionsMenu;

    public MainMenu(JFrame frame, OptionsMenu optionsMenu) {
        this.frame = frame;
        this.optionsMenu = optionsMenu;
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Brick Game", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 64));
        title.setForeground(Color.WHITE);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3, 20, 0));
        buttonsPanel.setOpaque(false);

        JButton playButton = new JButton("Play");
        playButton.setFont(new Font("Arial", Font.BOLD, 20));
        playButton.addActionListener(e -> {
            frame.setContentPane(new LevelSelectMenu(frame, optionsMenu));
            frame.revalidate();
        });

        JButton optionsButton = new JButton("Options");
        optionsButton.setFont(new Font("Arial", Font.BOLD, 20));
        optionsButton.addActionListener(e -> {
            frame.setContentPane(optionsMenu);
            frame.revalidate();
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.addActionListener(e -> System.exit(0));

        buttonsPanel.add(playButton);
        buttonsPanel.add(optionsButton);
        buttonsPanel.add(exitButton);

        add(title, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.SOUTH);

        setBackground(Color.DARK_GRAY);
    }
}
