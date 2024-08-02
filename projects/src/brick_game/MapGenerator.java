package brick_game;

import javax.swing.*;
import java.awt.*;

public class MapGenerator {

    public int[][] map;  // Tuğlaların durumu ve dayanıklılığı
    public int bricksWidth;
    public int bricksHeight;

    public MapGenerator(int level) {
        // Satır sayısını seviyeye göre ayarla
        int rows = level * 2 + 1;
        int cols = 8; // Sabit sütun sayısı
        map = new int[rows][cols];

        // Haritayı oluştur ve tuğla dayanıklılıklarını seviyeye göre belirle
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = level; // Dayanıklılığı seviyeye göre ayarla
            }
        }

        bricksHeight = 150 / rows; // Tuğla yüksekliğini satır sayısına göre ayarla
        bricksWidth = 540 / cols;  // Tuğla genişliğini sabit sütun sayısına göre ayarla
    }

    public void draw(Graphics2D g, Color brickColor) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(brickColor);
                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                    g.setStroke(new BasicStroke(2));
                    g.setColor(Color.decode("#468585"));
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                }
            }
        }
    }

    public void setBricksValue(int value, int row, int col) {
        map[row][col] = value;
    }

    public int getBallSize(int level) {
        return Math.max(10, 20 - level); // Minimum ball size is 10
    }

    public int getPaddleWidth(int level) {
        return Math.min(200, 100 + level * 10); // Maximum paddle width is 200
    }
}
