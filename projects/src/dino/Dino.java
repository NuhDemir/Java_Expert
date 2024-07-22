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
    int jumpHeight = 0;
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

    //Create the cactus on random position
    private void initCactusGraphics() {
        Random random = new Random();


        //Kaktüs sayısı

    }

    private void gameOver(Graphics g) {
    }

    private void restartGame(Graphics g) {
    }

    private void drawSun(Graphics g) {
    }

    private void drawCactus(Graphics g, int x, int h, int p, int i, int j, int y2) {
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
    public


    }

    private class MyGraph {
        int x_ = 10;
        int y_ = 100;
        int h_ = 60;
        int p_ = 10;
    }

    class MoveAction extends AbstractAction {
        public MoveAction(String name) {
            putValue(NAME, name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            onEnterPresses = true;
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
            if (gameOver) {
                gameOver = false;
                restartGame(getGraphics());
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
// TODO Auto-generated method stub
    }
}
