import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class GamePanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private static final int WIDTH = 512;
    private static final int HEIGHT = 448;
    private BufferedImage bufferedImage;
    private Graphics g;

    GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
//        setIgnoreRepaint(true);

        bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (bufferedImage != null) {
            g.drawImage(bufferedImage, 0, 0, this);
            g.dispose();
        }

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

//        g.clearRect(0, 0, this.getWidth(), this.getHeight());
//        BufferedImage bf = new BufferedImage( this.getWidth(),this.getHeight(), BufferedImage.TYPE_INT_RGB);
//        g.drawImage(bf,0,0,null);
    }


//        g.clearRect(0, 0, this.getWidth(), this.getHeight());
//
//        g.setColor(Color.RED);
//        g.fillRect(20, 50, this.getWidth() - 40, this.getHeight() - 100);
//        g.setColor(Color.BLACK);
//        g.drawRect(20, 50, this.getWidth() - 40, this.getHeight() - 100);
//        g.dispose();

//        bufferStrategy = frame.getBufferStrategy();
//        gamePanel.setIgnoreRepaint(true);
//        start();
//    }

//    private void start() {
//        isRunning = true;
//        thread = new Thread(this);
//        thread.start();
//    }
//
//    public void run() {
//        long start, elapsed, wait;
//        while (isRunning) {
//            start = System.nanoTime();
//            tick();
//            repaint();
//            elapsed = System.nanoTime() - start;
//            wait = (targetTime - elapsed) / 1000000;
//
//            if (wait <= 0) {
//                wait = 5;
//            }
//            try {
//                thread.sleep(wait);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void tick() {
//    }
//
//    public void paintComponent(Graphics g) {
////        super.paintComponent(g);
////        g.drawRect(10, 10, 10, 10);
//    }
//
//    public void keyPressed(KeyEvent args) {
//
//    }
//
//    public void keyReleased(KeyEvent args) {
//
//    }
//
//    public void keyTyped(KeyEvent args) {
//
//    }

}