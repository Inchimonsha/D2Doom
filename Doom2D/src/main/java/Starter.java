import GameResourses.GamePanel;

import javax.swing.*;

public class Starter {
    public static void main(String[] args) {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);
        win.setTitle("d2");

        GamePanel gamePanel = new GamePanel();
        win.add(gamePanel);
        win.pack();

        win.setLocationRelativeTo(null);
        win.setVisible(true);

        gamePanel.startGameThread();
    }
}
