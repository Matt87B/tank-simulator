import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        CardLayout cardLayout = new CardLayout();

        JPanel cardPanel = new JPanel(cardLayout);
        
        GamePanel gamePanel = new GamePanel(cardLayout);
        cardPanel.add(gamePanel, "gamePanel");

        JFrame frame = new JFrame("Tanks!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(cardPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
