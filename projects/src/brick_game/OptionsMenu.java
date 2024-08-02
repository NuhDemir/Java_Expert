package brick_game;

import javax.swing.*;
import java.awt.*;

public class OptionsMenu extends JPanel {

    private JFrame frame;
    private JComboBox<String> brickColorComboBox;
    private JSlider ballSpeedSlider;

    public OptionsMenu(JFrame frame) {
        this.frame = frame;
        // BorderLayout kullanarak panel düzenini belirle
        setLayout(new BorderLayout());

        // Başlık etiketi oluştur ve stilini ayarla
        JLabel title = new JLabel("Options", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);

        // Seçeneklerin yerleştirileceği paneli oluştur ve stilini ayarla
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        optionsPanel.setOpaque(false);

        // Brick Color Option
        // Tuğla rengi seçeneği için etiket ve açılır menüyü oluştur
        JLabel brickColorLabel = new JLabel("Brick Color:");
        brickColorLabel.setFont(new Font("Arial", Font.BOLD, 20));
        brickColorLabel.setForeground(Color.WHITE);
        brickColorComboBox = new JComboBox<>(new String[]{"Red", "Green", "Blue"});
        brickColorComboBox.setFont(new Font("Arial", Font.PLAIN, 18));

        // Tuğla rengi panelini oluştur ve içerisine etiket ve açılır menüyü ekle
        JPanel brickColorPanel = new JPanel();
        brickColorPanel.setOpaque(false);
        brickColorPanel.add(brickColorLabel);
        brickColorPanel.add(brickColorComboBox);

        // Ball Speed Option
        // Top hızını seçmek için etiket ve kaydırıcıyı oluştur
        JLabel ballSpeedLabel = new JLabel("Ball Speed:");
        ballSpeedLabel.setFont(new Font("Arial", Font.BOLD, 20));
        ballSpeedLabel.setForeground(Color.WHITE);
        ballSpeedSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        ballSpeedSlider.setMajorTickSpacing(1);
        ballSpeedSlider.setPaintTicks(true);
        ballSpeedSlider.setPaintLabels(true);
        ballSpeedSlider.setFont(new Font("Arial", Font.PLAIN, 18));

        // Top hız panelini oluştur ve içerisine etiket ve kaydırıcıyı ekle
        JPanel ballSpeedPanel = new JPanel();
        ballSpeedPanel.setOpaque(false);
        ballSpeedPanel.add(ballSpeedLabel);
        ballSpeedPanel.add(ballSpeedSlider);

        // Geri düğmesini oluştur ve stilini ayarla
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 20));
        backButton.setMaximumSize(new Dimension(200, 50));
        backButton.addActionListener(e -> {
            // Geri düğmesine tıklandığında ana menüye geçiş yap
            frame.setContentPane(new MainMenu(frame, this));
            frame.revalidate();
        });

        // Seçenekleri içeren panelin içerisine bileşenleri ekle
        optionsPanel.add(brickColorPanel);
        optionsPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Bileşenler arasına boşluk ekle
        optionsPanel.add(ballSpeedPanel);
        optionsPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Bileşenler arasına boşluk ekle
        optionsPanel.add(backButton);

        // Başlık ve seçenek panelini ana panele ekle
        add(title, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);

        // Arka plan rengini koyu gri olarak ayarla
        setBackground(Color.decode("#E76F51"));
    }

    // Seçilen tuğla rengini döndüren metot
    public Color getBrickColor() {
        String selectedColor = (String) brickColorComboBox.getSelectedItem();
        switch (selectedColor) {
            case "Red":
                return Color.decode("#DEF9C4");
            case "Green":
                return Color.decode("#9CDBA6");
            case "Blue":
                return Color.decode("#50B498");
            default:
                return Color.decode("#468585"); // Varsayılan olarak kırmızı döndür
        }
    }

    // Top hızını döndüren metot
    public int getBallSpeed() {
        return ballSpeedSlider.getValue();
    }
}
