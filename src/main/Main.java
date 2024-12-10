package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a window
        JFrame windowFrame = new JFrame("Chess");
        // Make program stop running when window is closed
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // To avoid messing with the size of the window
        windowFrame.setResizable(false);
        
        // Create a GameScreen for the window
        GameScreen gs = new GameScreen();
        // Add the GameScreen to the window
        windowFrame.add(gs);
        // adjust window size to gamescreen size
        windowFrame.pack();
        
        // location of the window should be at the center
        windowFrame.setLocationRelativeTo(null);
        // To see the window
        windowFrame.setVisible(true);

        // run the main game loop
        gs.launchGame();
    }
}