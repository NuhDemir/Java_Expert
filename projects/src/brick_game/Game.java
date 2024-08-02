package brick_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private boolean gameStarted = false;
    private int score = 0;
    private int totalBricks;
    private Timer timer;
    private int delay;
    private int playerX = 310;
    private int ballPositionX = 120;
    private int ballPositionY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;
    private MapGenerator map;
    private int level;
    private OptionsMenu optionsMenu;

    public Game(JFrame frame, int level, OptionsMenu optionsMenu) {
        this.level = level;
        this.optionsMenu = optionsMenu;
        this.delay = 11 - optionsMenu.getBallSpeed(); // Use the selected ball speed
        map = new MapGenerator(level);
        totalBricks = map.map.length * map.map[0].length;
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(1, 1, 692, 592);

        map.draw(g2d, optionsMenu.getBrickColor()); // Use the selected brick color

        g2d.setColor(Color.yellow);
        g2d.fillRect(0, 0, 3, 592);
        g2d.fillRect(0, 0, 692, 3);
        g2d.fillRect(691, 0, 3, 592);

        g2d.setColor(Color.white);
        g2d.setFont(new Font("poppins", Font.BOLD, 25));
        g2d.drawString("" + score, 590, 30);

        g2d.setColor(Color.yellow);
        g2d.fillRect(playerX, 550, 100, 8);

        g2d.setColor(Color.green);
        g2d.fillOval(ballPositionX, ballPositionY, 20, 20);

        if (!gameStarted) {
            g2d.setColor(Color.red);
            g2d.setFont(new Font("serif", Font.BOLD, 30));
            g2d.drawString("Press Any Key to Start", 200, 300);
        }

        if (ballPositionY > 570) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g2d.setColor(Color.red);
            g2d.setFont(new Font("serif", Font.BOLD, 30));
            g2d.drawString("   Game Over\n Score: " + score, 190, 300);

            g2d.setFont(new Font("serif", Font.BOLD, 30));
            g2d.drawString("    Press Any Key to Restart", 190, 340);
        }

        if (totalBricks == 0) {
            play = false;
            ballYdir = -2;
            ballXdir = -1;
            g2d.setColor(Color.red);
            g2d.setFont(new Font("serif", Font.BOLD, 30));
            g2d.drawString("    Game Over: " + score, 190, 300);

            g2d.setFont(new Font("serif", Font.BOLD, 30));
            g2d.drawString("   Press Any Key to Restart", 190, 340);
        }

        g2d.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (play) {
            if (new Rectangle(ballPositionX, ballPositionY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballYdir = -ballYdir;
            }

            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.bricksWidth + 80;
                        int brickY = i * map.bricksHeight + 50;
                        int bricksWidth = map.bricksWidth;
                        int bricksHeight = map.bricksHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, bricksWidth, bricksHeight);
                        Rectangle ballrect = new Rectangle(ballPositionX, ballPositionY, 20, 20);

                        if (ballrect.intersects(rect)) {
                            map.setBricksValue(0, i, j);
                            totalBricks--;
                            score += 5;
                            if (ballPositionX + 19 <= rect.x || ballPositionX + 1 >= rect.x + bricksWidth) {
                                ballXdir = -ballXdir;
                            } else {
                                ballYdir = -ballYdir;
                            }
                            break A;
                        }
                    }
                }
            }

            ballPositionX += ballXdir;
            ballPositionY += ballYdir;
            if (ballPositionX < 0) {
                ballXdir = -ballXdir;
            }
            if (ballPositionY < 0) {
                ballYdir = -ballYdir;
            }
            if (ballPositionX > 670) {
                ballXdir = -ballXdir;
            }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }

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

        if (!gameStarted) {
            gameStarted = true;
            play = true;
        }
    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }

    public void moveLeft() {
        play = true;
        playerX -= 20;
    }
}
