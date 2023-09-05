package org.dm;

import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class GamePanel implements Runnable {

    Thread gameThread;

    public GamePanel(Scene win) {
        win.setFill(Color.BLACK);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    }
}
