package brick_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener, ActionListener {

    private boolean play = false; // Oyunun oynanıp oynanmadığını kontrol eder
    private boolean gameStarted = false; // Oyunun başlatılıp başlatılmadığını kontrol eder
    private int score = 0; // Oyuncunun skorunu tutar
    private int totalBricks; // Toplam tuğla sayısını tutar
    private Timer timer; // Oyun zamanlayıcısı
    private int delay; // Zamanlayıcının gecikme süresi (milisaniye cinsinden)
    private int playerX = 310; // Oyuncu çubuğunun X koordinatı
    private int ballPositionX = 120; // Topun X koordinatı
    private int ballPositionY = 350; // Topun Y koordinatı
    private int ballXdir = -1; // Topun X yönü
    private int ballYdir = -2; // Topun Y yönü
    private MapGenerator map; // Tuğla haritasını tutar
    private int level; // Oyun seviyesini tutar
    private OptionsMenu optionsMenu; // Seçenekler menüsünü tutar
    private int speedIncreaseInterval = 10000; // Hız artış intervali (milisaniye cinsinden)

    // Ball and paddle size scaling factors
    private static final int INITIAL_BALL_SIZE = 20;
    private static final int INITIAL_PADDLE_WIDTH = 100;
    private static final int INITIAL_PADDLE_HEIGHT = 8;

    public Game(JFrame frame, int level, OptionsMenu optionsMenu) {
        this.level = level; // Oyun seviyesini ayarla
        this.optionsMenu = optionsMenu; // Seçenekler menüsünü ayarla
        this.delay = 11 - optionsMenu.getBallSpeed(); // Seçilen top hızına göre zamanlayıcı gecikmesini ayarla
        map = new MapGenerator(level); // Haritayı oluştur
        totalBricks = map.map.length * map.map[0].length; // Toplam tuğla sayısını hesapla
        addKeyListener(this); // Klavye dinleyicisini ekle
        setFocusable(true); // Panoyu odaklanabilir yap
        setFocusTraversalKeysEnabled(false); // Odaklanma tuşlarını devre dışı bırak

        // Oyun zamanlayıcısını oluştur ve başlat
        timer = new Timer(delay, this);
        timer.start();

        // Top hızını artıran zamanlayıcıyı oluştur
        Timer speedTimer = new Timer(speedIncreaseInterval, e -> {
            // Topun X ve Y yönlerinde hızını artır
            ballXdir += (ballXdir > 0 ? 1 : -1);
            ballYdir += (ballYdir > 0 ? 1 : -1);
        });
        speedTimer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Arka plan rengini degrade olarak ayarla
        Color color1 = Color.decode("#E9C46A");
        Color color2 = Color.decode("#F4A261");
        int width = getWidth();
        int height = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);

        // Tuğla haritasını çiz
        map.draw(g2d, optionsMenu.getBrickColor()); // Seçilen tuğla rengini kullan

        // Kenarlıkları çiz
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 3, height); // Sol kenar
        g2d.fillRect(0, 0, width, 3); // Üst kenar
        g2d.fillRect(width - 3, 0, 3, height); // Sağ kenar

        // Skoru göster
        g2d.setColor(Color.white);
        g2d.setFont(new Font("Poppins", Font.BOLD, 25));
        g2d.drawString("" + score, width - 70, 30);

        // Oyuncu çubuğunu çiz
        int paddleWidth = INITIAL_PADDLE_WIDTH - (level - 1) * 5; // Uzunluk, seviyeye göre kısalır
        int paddleHeight = INITIAL_PADDLE_HEIGHT;
        paddleWidth = Math.max(paddleWidth, 50); // Minimum uzunluk
        g2d.setColor(Color.decode("#522258"));
        g2d.fillRect(playerX, height - paddleHeight - 10, paddleWidth, paddleHeight);

        // Topu çiz
        int ballSize = INITIAL_BALL_SIZE - (level - 1) * 2; // Çap, seviyeye göre küçülür
        ballSize = Math.max(ballSize, 10); // Minimum boyut
        g2d.setColor(Color.decode("#36BA98"));
        g2d.fillOval(ballPositionX, ballPositionY, ballSize, ballSize);

        // Oyun başlamamışsa başlangıç mesajını göster
        if (!gameStarted) {
            g2d.setColor(Color.decode("#8C3061"));
            g2d.setFont(new Font("Serif", Font.BOLD, 30));
            g2d.drawString("Press Any Key to Start", 200, height / 2);
        }

        // Top ekranın altına düştüyse 'Game Over' mesajını göster
        if (ballPositionY > height - paddleHeight - 10) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g2d.setColor(Color.decode("#8C3061"));
            g2d.setFont(new Font("Serif", Font.BOLD, 30));
            g2d.drawString("   Game Over\n Score: " + score, 200, height / 2);
            g2d.setFont(new Font("Serif", Font.BOLD, 30));
            g2d.drawString("    Press Any Key to Restart", 200, height / 2 + 40);
        }

        // Tüm tuğlalar yok olduyse 'Game Over' mesajını göster
        if (totalBricks == 0) {
            play = false;
            ballYdir = -2;
            ballXdir = -1;
            g2d.setColor(Color.red);
            g2d.setFont(new Font("Serif", Font.BOLD, 30));
            g2d.drawString("    Game Over: " + score, 200, height / 2);
            g2d.setFont(new Font("Serif", Font.BOLD, 30));
            g2d.drawString("   Press Any Key to Restart", 200, height / 2 + 40);
        }

        g2d.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (play) {
            // Top oyuncu çubuğuna çarptığında topun yönünü değiştir
            if (new Rectangle(ballPositionX, ballPositionY, getBallSize(), getBallSize())
                    .intersects(new Rectangle(playerX, getHeight() - getPaddleHeight() - 10, getPaddleWidth(), getPaddleHeight()))) {
                ballYdir = -ballYdir;
            }

            // Tuğlalara çarpma kontrolü
            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.bricksWidth + 80;
                        int brickY = i * map.bricksHeight + 50;
                        int bricksWidth = map.bricksWidth;
                        int bricksHeight = map.bricksHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, bricksWidth, bricksHeight);
                        Rectangle ballrect = new Rectangle(ballPositionX, ballPositionY, getBallSize(), getBallSize());

                        if (ballrect.intersects(rect)) {
                            // Tuğlaya çarptığında tuğlayı yok et ve skoru artır
                            map.setBricksValue(0, i, j);
                            totalBricks--;
                            score += 5;

                            // Topun yönünü değiştir
                            if (ballPositionX + getBallSize() - 1 <= rect.x || ballPositionX + 1 >= rect.x + rect.width) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }

                            break A;
                        }
                    }
                }
            }

            // Topu hareket ettir
            ballPositionX += ballXdir;
            ballPositionY += ballYdir;

            // Top ekranın kenarlarına çarptığında yönünü değiştir
            if (ballPositionX < 0 || ballPositionX > getWidth() - getBallSize()) {
                ballXdir = -ballXdir;
            }
            if (ballPositionY < 0) {
                ballYdir = -ballYdir;
            }
        }
        repaint(); // Panoyu tekrar çiz
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Sağ ok tuşu ile oyuncu çubuğunu sağa hareket ettir
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= getWidth() - getPaddleWidth()) {
                playerX = getWidth() - getPaddleWidth();
            } else {
                moveRight();
            }
        }
        // Sol ok tuşu ile oyuncu çubuğunu sola hareket ettir
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX <= 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

        // Enter tuşuna basıldığında oyunu başlat
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                play = true;
                ballPositionX = 120;
                ballPositionY = 350;
                ballXdir = -1;
                ballYdir = -2;
                score = 0;
                playerX = 310;
                totalBricks = map.map.length * map.map[0].length;
                map = new MapGenerator(level);
                repaint();
            }
        }

        // Oyun başlamamışsa oyunu başlat
        if (!gameStarted) {
            gameStarted = true;
            play = true;
        }
    }

    // Oyuncu çubuğunu sağa hareket ettir
    public void moveRight() {
        play = true;
        playerX += 40;
    }

    // Oyuncu çubuğunu sola hareket ettir
    public void moveLeft() {
        play = true;
        playerX -= 40;
    }

    // Top boyutunu hesapla
    private int getBallSize() {
        return INITIAL_BALL_SIZE - (level - 1) * 2;
    }

    // Çubuğun genişliğini hesapla
    private int getPaddleWidth() {
        return INITIAL_PADDLE_WIDTH - (level - 1) * 5;
    }

    // Çubuğun yüksekliğini hesapla
    private int getPaddleHeight() {
        return INITIAL_PADDLE_HEIGHT;
    }

    // Çubuğun Y konumunu hesapla
    private int getPaddleYPosition() {
        return getHeight() - getPaddleHeight() - 10;
    }
}
