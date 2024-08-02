package brick_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LevelSelectMenu extends JPanel {
    public LevelSelectMenu(JFrame frame, OptionsMenu optionsMenu) {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#536493"));

        JLabel title = new JLabel("Seviye Seçiniz", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 48));
        title.setForeground(Color.decode("#FFF1DB"));

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 3, 15, 15)); // 3x3 grid layout with spacing
        buttonsPanel.setOpaque(false);

        // Titles from Dante's "Divine Comedy"
        String[] levelTitles = {
                "Limbo",       // Level 1
                "Lust",        // Level 2
                "Gluttony",    // Level 3
                "Greed",       // Level 4
                "Wrath",       // Level 5
                "Heresy",      // Level 6
                "Violence",    // Level 7
                "Fraud",       // Level 8
                "Treachery"    // Level 9
        };

        // Create buttons for each level
        for (int i = 0; i < levelTitles.length; i++) {
            final int level = i + 1; // Level number starts from 1
            JButton levelButton = createStyledButton(levelTitles[i], e -> {
                frame.setContentPane(new Game(frame, level, optionsMenu));
                frame.revalidate();
            });
            buttonsPanel.add(levelButton);
        }

        JScrollPane scrollPane = new JScrollPane(buttonsPanel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); // Remove scroll pane border
        scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Smooth scrolling
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // No horizontal scroll

        add(title, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private JButton createStyledButton(String text, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(200, 60)); // Adjusted size for fitting
        button.setFont(new Font("Arial", Font.BOLD, 20)); // Slightly smaller font
        button.setBackground(Color.decode("#FFF1DB"));
        button.setForeground(Color.decode("#536493"));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.decode("#536493"), 2), // Thinner border
                BorderFactory.createEmptyBorder(10, 10, 10, 10))); // Add padding
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor on hover

        // Add a hover effect to the button
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.decode("#DCE1E3")); // Light background on hover
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.decode("#FFF1DB")); // Original background
            }
        });

        button.addActionListener(actionListener);
        return button;
    }
}
