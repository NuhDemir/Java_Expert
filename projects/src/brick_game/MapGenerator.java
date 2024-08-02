package brick_game;

import javax.swing.*;
import java.awt.*;

public class MapGenerator {

    public int[][] map;
    public int bricksWidth;
    public int bricksHeight;

    public MapGenerator(int level) {
        // Harita yapısını seviye parametresine göre ayarla
        int rows = level; // Örneğin, seviye 1 için 3 satır, seviye 2 için 5 satır
        int cols = 7; // Sabit sütun sayısı
        map = new int[rows][cols];
        for (int[] map1 : map) {
            for (int j = 0; j < map[0].length; j++) {
                map1[j] = 1;
            }
        }
        bricksHeight = 150 / rows;
        bricksWidth = 540 / cols;
    }

    public void draw(Graphics2D g, Color brickColor) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(brickColor);
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                    g.setStroke(new BasicStroke(5));
                    g.setColor(Color.BLACK);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                }
            }
        }
    }

    public void setBricksValue(int value, int row, int col) {
        map[row][col] = value;
    }
}
