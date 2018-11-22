import java.awt.*;

public class Game implements Runnable {
    private Display display;

    private final int FPS = 60;
    private final double TIME_PER_TICK = 1_000_000_000 / FPS;

    private Thread thread;
    private boolean isRunning = false;
    private Graphics g;

    private State gameState;
    private State menuState;

    public Game() {
    }

    private void init() {
        display = new Display();
        Assets.init();
        gameState = new GameState();
        GameStateManager.setCurrentState(gameState);
    }

    private void update() {
        if (gameState != null) {
            gameState.update();
        }
    }

    private void render() {
        g = display.getGamePanel().getBufferedImage().getGraphics();
        display.getGamePanel().repaint();
        g.dispose();

        if (gameState != null) {
            gameState.render(g);
        }
    }

    public void run() {
        init();

        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while (isRunning) {
            now = System.nanoTime();
            delta += (now - lastTime) / TIME_PER_TICK;
            lastTime = now;

            if (delta >= 1) {
                update();
                render();
                delta--;
            }
        }
        stop();
    }

    public synchronized void start() {
        if (isRunning) {
            return;
        }
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop() {
        if (!isRunning) {
            return;
        }
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
