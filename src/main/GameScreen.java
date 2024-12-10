package main;

import javax.swing.JPanel;
import java.awt.*;


public class GameScreen extends JPanel{
    public static final int WIDTH = 1100;
    public static final int HEIGHT = 800;

    // constructor
    public GameScreen() {
        // set the size of the panel
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // background color of the panel
        setBackground(Color.black);
    }
}
