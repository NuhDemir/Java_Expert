package dino;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.dnd.DragGestureEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.util.*;
import javax.lang.model.element.Name;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import java.awt.event.KeyListener;


public class Dino extends Frame implements KeyListener {
    // Oyun boyutları için sabitler
    final int GAME_WIDTH = 1200;
    final int GAME_HEIGHT = 500;
    static int unitSize = 20;

    // Farklı oyun elemanları için renk tanımları
    Color dinosaurColor = Color.GRAY;
    Color gameOverTextColorPrimary = Color.BLACK;
    Color gameOverTextColorSecondary = Color.YELLOW;
    Color cactusColorPrimary = Color.GREEN;
    Color cactusColorSecondary = Color.GREEN;

    // Dinozorun zıplama mekaniği için değişkenler
    int jump = 0;
    int jumpYPosition = 0;
    int yPosition = 0;

    // Tuş basma ve oyun durumu için bayraklar
    boolean isEnterPressed = false;
    boolean isDownPressed = false;
    boolean isGameOver = false;

    // Grafik elemanlarını tutmak için liste
    List<MyGraph> graphicalElements = new ArrayList<>();

    // Dinozorun mevcut pozisyonu
    int currentDinosaurX = 0;
    int currentDinosaurY = 0;

    // Oyun elemanlarını çizmek için panel
    DrawPanel drawPanel = new DrawPanel();

    public static void main(String[] args) {
        new Dino();
    }

    public Dino() {
        setVisible(true);
    }

    //Create the cactus on random position
    private void initCactusGraphics() {
        Random random = new Random();

        // Kaktüs sayısı
        int numberOfCacti = 2;

        // Kaktüs başlangıç konumları ve boyutları
        int initialXPosition = 10;
        int initialYPosition = 100;
        int initialHeight = 60;
        int initialPadding = 10;

        // Grafik elemanları listesini başlat
        graphicalElements = new ArrayList<MyGraph>();
        for (int i = 0; i < numberOfCacti; i++) {
            // Rastgele adım belirleyici
            int step = random.nextInt(10) + 1;

            // Yeni bir kaktüs grafik nesnesi oluştur
            MyGraph cactus = new MyGraph();

            // Kaktüsün X pozisyonunu hesapla
            cactus.xPosition = initialXPosition * 30 + step * 10 + 600;

            // Kaktüsün yüksekliğini hesapla
            cactus.height = 10 + (6 * step) + 2;

            // Kaktüsün Y pozisyonunu hesapla
            cactus.yPosition = 300 - initialHeight;

            // Kaktüsün genişliğini hesapla
            cactus.padding = 8 + step / 2;

            // Grafik elemanları listesine kaktüsü ekle
            graphicalElements.add(cactus);
        }
    }

    //kaktüs çizimi
    private void drawCactus(Graphics g) {
        // Başlangıç pozisyonları ve diğer değişkenler tanımlanıyor
        int xPosition = 0;
        int yPosition = 0;
        int height = 0;
        int padding = 0;

        // Grafiksel elemanları döngü ile işlemek için
        for (MyGraph myGraph : graphicalElements) {
            // Grafik elemanlarının pozisyon ve boyut bilgileri alınıyor
            xPosition = myGraph.xPosition;
            yPosition = myGraph.yPosition;
            height = myGraph.height;
            padding = myGraph.padding;

            int maxH = 180; // Maksimum yükseklik
            int i = padding * 2 + 40; // Çizim için hesaplanan değer
            int j = padding * 2 + 40; // Çizim için hesaplanan değer
            int y1 = yPosition + 40; // Y pozisyonu için hesaplanan değer
            int y2 = yPosition + 60; // Y pozisyonu için hesaplanan değer

            // Eğer x pozisyonu sıfırdan küçükse, zıplama değerini sıfırla
            if (xPosition + j - jump < 0) {
                jump = 0;
            }

            // Çeşitli grafik elemanlarını çiz
            draw(g, xPosition - i - jump, y1, height, padding);
            draw(g, xPosition - jump, yPosition, maxH, padding * 2);
            draw(g, xPosition + j - jump, y2, height, padding);

            // Ek bir çizim fonksiyonu çağrılıyor
            drow(g, xPosition - jump, height, padding, i, j, y1, y2);
        }
    }

    private void gameOver(Graphics g) {
    }

    private void restartGame(Graphics g) {
    }

    private void drawSun(Graphics g) {
    }

    private void drow(Graphics g, int x, int h, int p, int i, int j, int y1, int y2) {
        Graphics2D gsds = (Graphics2D) g;
        gsds.setPaint(cactusColorPrimary);
        gsds.fillRect(x - i + p, y1 + h, i, p);
        Graphics2D gsdds = (Graphics2D) g;
        gsdds.setPaint(cactusColorSecondary);
        gsdds.fillRect(x - i + 2 * p, y1 + h - p, i - 2 * p, p);
        Graphics2D gsd2 = (Graphics2D) g;
        gsd2.setPaint(cactusColorSecondary);
        gsd2.fillRect(x + p * 2, y2 + h, j - p, p);
        Graphics2D gsd3 = (Graphics2D) g;
        gsd3.setPaint(cactusColorPrimary);
        gsd3.fillRect(x + p * 4, y2 + h - p, j - 4 * p, p);
    }

    private void drawSurface(Graphics g, int x, int y, int maxH) {
    }

    private void drawDinosaur(Graphics g, int y) {
    }

    private void drawRaw(Graphics g, int Dinosaur, int y, int w, int h) {
    }

    private void draw(Graphics g, int x, int y, int h, int p) {
    }

    private class DrawPanel extends JPanel {


    }

    private class MyGraph {
        int xPosition = 10;  // Kaktüsün X pozisyonu
        int yPosition = 100; // Kaktüsün Y pozisyonu
        int height = 60;     // Kaktüsün yüksekliği
        int padding = 10;    // Kaktüsün genişliği veya kenar boşluğu
    }

    class MoveAction extends AbstractAction {
        public MoveAction(String name) {
            putValue(NAME, name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            isEnterPressed = true;
            drawPanel.repaint();
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
// TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (isGameOver) {
                isGameOver = false;
                restartGame(getGraphics());
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
// TODO Auto-generated method stub
    }
}
