package myPrograms.graphics;


/**
 * Write a description of class IndianFlag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;

public class IndianFlag extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set dimensions
        int width = getWidth();
        int height = getHeight();
        
        // Draw saffron color (top part)
        g.setColor(new Color(255, 140, 0)); // Saffron color
        g.fillRect(0, 0, width, height / 3);
        
        // Draw white color (middle part)
        g.setColor(Color.WHITE);
        g.fillRect(0, height / 3, width, height / 3);
        
        // Draw Ashoka Chakra (simplified representation)
        g.setColor(Color.BLUE);
        g.fillOval(width / 2 - 50, height / 2 - 50, 100, 100);
        
        // Draw green color (bottom part)
        g.setColor(new Color(0, 128, 0)); // Green color
        g.fillRect(0, height * 2 / 3, width, height / 3);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Indian Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new IndianFlag());
        frame.setVisible(true);
    }
}

