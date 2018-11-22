import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {

    private GamePanel gamePanel;
    private static final int WIDTH = 512;
    private static final int HEIGHT = 448;

//    private GameCanvas gameCanvas;

    public Display() {
        setTitle("Clu Clu Land Special");

//        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setFocusable(true);

        gamePanel = new GamePanel();
        setLayout(new BorderLayout());
//        add(gameCanvas, BorderLayout.CENTER);
        add(gamePanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

//        setIgnoreRepaint(true);
//        createBufferStrategy(2);
//        gameCanvas = new GameCanvas();
//        gameCanvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        gameCanvas.setMaximumSize(new Dimension(WIDTH, HEIGHT));
//        gameCanvas.setMinimumSize(new Dimension(WIDTH, HEIGHT));

//        add(gameCanvas);
//        pack();
    }

    @Override
    public void paint (Graphics g) {}

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }

//    public GameCanvas getGameCanvas() {
//        return gameCanvas;
//    }
}
