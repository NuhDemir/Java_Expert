package brick_game;

import javax.swing.*;
import java.awt.*;

public class OptionsMenu extends JPanel {

    private JFrame frame;
    private JComboBox<String> brickColorComboBox;
    private JSlider ballSpeedSlider;

    public OptionsMenu(JFrame frame) {
        this.frame = frame;
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Options", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        optionsPanel.setOpaque(false);

        // Brick Color Option
        JLabel brickColorLabel = new JLabel("Brick Color:");
        brickColorLabel.setFont(new Font("Arial", Font.BOLD, 20));
        brickColorLabel.setForeground(Color.WHITE);
        brickColorComboBox = new JComboBox<>(new String[]{"Red", "Green", "Blue"});
        brickColorComboBox.setFont(new Font("Arial", Font.PLAIN, 18));
        JPanel brickColorPanel = new JPanel();
        brickColorPanel.setOpaque(false);
        brickColorPanel.add(brickColorLabel);
        brickColorPanel.add(brickColorComboBox);

        // Ball Speed Option
        JLabel ballSpeedLabel = new JLabel("Ball Speed:");
        ballSpeedLabel.setFont(new Font("Arial", Font.BOLD, 20));
        ballSpeedLabel.setForeground(Color.WHITE);
        ballSpeedSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        ballSpeedSlider.setMajorTickSpacing(1);
        ballSpeedSlider.setPaintTicks(true);
        ballSpeedSlider.setPaintLabels(true);
        ballSpeedSlider.setFont(new Font("Arial", Font.PLAIN, 18));
        JPanel ballSpeedPanel = new JPanel();
        ballSpeedPanel.setOpaque(false);
        ballSpeedPanel.add(ballSpeedLabel);
        ballSpeedPanel.add(ballSpeedSlider);

        // Back Button
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setMaximumSize(new Dimension(200, 50));
        backButton.addActionListener(e -> {
            frame.setContentPane(new MainMenu(frame, this));
            frame.revalidate();
        });

        optionsPanel.add(brickColorPanel);
        optionsPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        optionsPanel.add(ballSpeedPanel);
        optionsPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        optionsPanel.add(backButton);

        add(title, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);

        setBackground(Color.DARK_GRAY);
    }

    public Color getBrickColor() {
        String selectedColor = (String) brickColorComboBox.getSelectedItem();
        switch (selectedColor) {
            case "Red":
                return Color.RED;
            case "Green":
                return Color.GREEN;
            case "Blue":
                return Color.BLUE;
            default:
                return Color.RED;
        }
    }

    public int getBallSpeed() {
        return ballSpeedSlider.getValue();
    }
}
