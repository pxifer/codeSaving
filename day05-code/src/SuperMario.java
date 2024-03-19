import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SuperMario extends JFrame implements ActionListener, KeyListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int GROUND = 500;
    private static final int MARIO_SIZE = 32;

    private Timer timer;
    private int marioX, marioY;
    private boolean isJumping;
    private int jumpHeight;

    public SuperMario() {
        setTitle("Super Mario");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        addKeyListener(this);

        marioX = 100;
        marioY = GROUND - MARIO_SIZE;
        isJumping = false;
        jumpHeight = 0;

        timer = new Timer(1000 / 60, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(marioX, marioY, MARIO_SIZE, MARIO_SIZE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isJumping) {
            marioY -= jumpHeight;
            jumpHeight--;
            if (marioY >= GROUND - MARIO_SIZE) {
                marioY = GROUND - MARIO_SIZE;
                isJumping = false;
            }
        } else {
            marioY = GROUND - MARIO_SIZE;
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !isJumping) {
            isJumping = true;
            jumpHeight = 10;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SuperMario game = new SuperMario();
            game.setVisible(true);
        });
    }
}
