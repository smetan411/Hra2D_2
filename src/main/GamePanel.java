package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable{
    //screen settings
    final int originalTileSize = 16; //16x16 pixel, základní velikost spritů
    final int scale = 3; // zvětšení spritů třikrát
    public final int tileSize = originalTileSize * scale; //48x48 pixel
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;// 48x16=768 pixels
    final int screenHeight = tileSize * maxScreenRow;// 48*12=576 pixels

    Thread gameThread;
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();//automaticky zavola metodu run()
    }
    @Override
    public void run() {
        while(gameThread != null){
            System.out.println("Hra běží.");
        }
    }
}