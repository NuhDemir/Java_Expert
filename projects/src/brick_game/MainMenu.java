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

        // Arka plan gradyanı için gerekli ayarları
        setOpaque(false); // Gradyanı düzgün göstermek için

        // Başlık paneli oluştur
        JPanel titlePanel = new JPanel();
        titlePanel.setOpaque(false);
        JLabel title = new JLabel("BRİCK GAME", SwingConstants.CENTER);
        title.setFont(new Font("Poppins", Font.BOLD, 64)); // Başlık fontunu küçülttüm
        title.setForeground(Color.decode("#FFF1DB"));
        titlePanel.add(title);

        // Butonlar panelini oluştur
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 1, 80, 80)); // Butonlar arasındaki boşlukları küçülttüm
        buttonsPanel.setOpaque(false); // Arka planın gradyan olabilmesi için
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(80, 120, 80, 120));

        JButton playButton = createButton("Play");
        JButton optionsButton = createButton("Options");
        JButton exitButton = createButton("Exit");

        playButton.addActionListener(e -> {
            frame.setContentPane(new LevelSelectMenu(frame, optionsMenu));
            frame.revalidate();
        });

        optionsButton.addActionListener(e -> {
            frame.setContentPane(optionsMenu);
            frame.revalidate();
        });

        exitButton.addActionListener(e -> System.exit(0));

        buttonsPanel.add(playButton);
        buttonsPanel.add(optionsButton);
        buttonsPanel.add(exitButton);

        // Merkezi paneli oluştur ve başlığı ve butonları ekle
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setOpaque(false);
        centerPanel.add(titlePanel, BorderLayout.NORTH);
        centerPanel.add(buttonsPanel, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 16)); // Buton fontunu küçülttüm
        button.setBackground(Color.decode("#FFF1DB"));
        button.setForeground(Color.decode("#536493"));
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(120, 40)); // Buton boyutunu küçülttüm
        button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // İç boşlukları küçülttüm
        return button;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0, 0, Color.decode("#536493"), 0, getHeight(), Color.decode("#7A9AC2"));
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
