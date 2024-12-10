package main;

import javax.swing.JPanel;
import java.awt.*;


public class GameScreen extends JPanel implements Runnable{ // Runnable is an interface that is used to create a thread
    // game screen size
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;
    // Frames per second
    final int FPS = 60;
    // to create our game loop
    Thread gameThread;

    // constructor
    public GameScreen() {
        // set the size of the panel
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // background color of the panel
        setBackground(Color.black);
    }

    public void launchGame() {
        // instantiate the game thread
        gameThread = new Thread(this);
        // calls the run method
        gameThread.start();
    }
    
    // Must be used if you use the Runnable interface
    @Override
    public void run() {
        // game loop
        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        while (gameThread != null) {
            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                // calls paint component method
                repaint();
                delta -= 1;
            }
        }

    }
    
    // method to update game pieces information
    public void update() {

    }

    // method to draw objects on the gamescreen
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
