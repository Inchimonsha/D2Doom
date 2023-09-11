package GameResourses;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;

    private final int maxScrCol = 16;
    private final int maxScrRow = 12;
    final int screenWidth = tileSize * maxScrCol;
    final int screenHeight = tileSize * maxScrRow;

    Thread gameThread;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null) {
            update();
            repaint();

            System.out.println("a");
        }
    }
    public void update() {

    }
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D gr2 = (Graphics2D) gr;
        gr2.setColor(Color.WHITE);
        gr2.fillRect(100, 100, tileSize, tileSize);

        gr2.dispose();
    }
}
