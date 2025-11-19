
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

    private final CardLayout cardLayout;

    GamePanel(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(800, 500);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        
        
        g2d.dispose();
    }
}
