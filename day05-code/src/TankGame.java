import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankGame extends JFrame implements ActionListener, KeyListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private Timer timer;
    private int tankX, tankY;
    private boolean isMovingRight, isMovingLeft;

    public TankGame() {
        setTitle("Tank Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addKeyListener(this);

        tankX = WIDTH / 2 - 50;
        tankY = HEIGHT - 100;
        isMovingRight = false;
        isMovingLeft = false;

        timer = new Timer(1000 / 60, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(tankX, tankY, 100, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isMovingRight) {
            tankX += 5;
        } else if (isMovingLeft) {
            tankX -= 5;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            isMovingRight = true;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            isMovingLeft = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            isMovingRight = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            isMovingLeft = false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TankGame game = new TankGame();
            game.setVisible(true);
        });
    }
}
