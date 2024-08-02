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

        // Arka plan rengini ayarla
        setBackground(Color.decode("#536493"));

        JLabel title = new JLabel("BRİCK GAME", SwingConstants.CENTER);
        title.setFont(new Font("poppins", Font.BOLD, 72));
        title.setForeground(Color.decode("#FFF1DB"));

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 3, 20, 0));
        buttonsPanel.setOpaque(false);

        JButton playButton = new JButton("Play");
        playButton.setFont(new Font("Arial", Font.BOLD, 20));
        playButton.setBackground(Color.decode("#FFF1DB"));
        playButton.setForeground(Color.decode("#536493"));
        playButton.setFocusPainted(false);
        playButton.addActionListener(e -> {
            frame.setContentPane(new LevelSelectMenu(frame, optionsMenu));
            frame.revalidate();
        });

        JButton optionsButton = new JButton("Options");
        optionsButton.setFont(new Font("Arial", Font.BOLD, 20));
        optionsButton.setBackground(Color.decode("#FFF1DB"));
        optionsButton.setForeground(Color.decode("#536493"));
        optionsButton.setFocusPainted(false);
        optionsButton.addActionListener(e -> {
            frame.setContentPane(optionsMenu);
            frame.revalidate();
        });

        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.setBackground(Color.decode("#FFF1DB"));
        exitButton.setForeground(Color.decode("#536493"));
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(e -> System.exit(0));

        buttonsPanel.add(playButton);
        buttonsPanel.add(optionsButton);
        buttonsPanel.add(exitButton);

        add(title, BorderLayout.NORTH);
        add(buttonsPanel, BorderLayout.SOUTH);
    }
}
