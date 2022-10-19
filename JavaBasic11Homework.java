package swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Java Basic, Homework #11
 *
 * @author Mykola Sheremet
 * @todo 12.10.2022
 * @done 19.10.2022
 */

public class JavaBasic11Homework extends JFrame {
    final int CANVAS_WIDTH = 600;
    final int CANVAS_HEIGTH = 300;

    final int DX = 100;

    int x, y, dx;
    Color color;

    ImageIcon image;

    List<Ball> balls;

    final private Color[] COLORS = {Color.red, Color.green, Color.magenta,
            Color.cyan, Color.orange, Color.pink, Color.gray, Color.black};
    private Random random = new Random();

    public static void main(String[] args) {
        new JavaBasic11Homework();
    }

    public JavaBasic11Homework() {
        setTitle("Hello Swing");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CanvasPanel canvasPanel = new CanvasPanel();
        canvasPanel.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGTH));
        canvasPanel.setBackground(Color.white);

        initBalls();

        image = new ImageIcon("cat.jpg");

//        addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent event) {
//                super.keyReleased(event);
//                System.out.println(event);
//                switch (event.getKeycode()) ;
//                    case 32:
//                        randomXYColor();
//                        break;
//                    case 38:
//                        y -= 5;
//                        break;
//                    case 40:
//                        y += 5;
//                        break;
//                    case 37:
//                        x += 5;
//                        break;
//                    case 39:
//                        x += 5:
//                        break;
//                }
//                canvasPanel.repaint();
//            }
//        });

        canvasPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent event) {
                super.mouseReleased(event);
                System.out.println(event.getX() + ":" + event.getY());
                for (int i = balls.size() - 1; i > -1; i--) {
                    if (balls.get(i).isInBall(event.getX(), event.getY())) {
                        balls.remove(i);
                        break;
                    }
                }
                canvasPanel.repaint();
            }
        });

        randomXYColor();

        Button repaint = new Button("Repaint");
        repaint.addActionListener(e -> {
            System.out.println("Repaint");
            randomXYColor();
            canvasPanel.repaint();
        });

        Button left = new Button("Left");
        left.addActionListener(e -> {
            x -= 5;
            canvasPanel.repaint();
        });
        Button right = new Button("Right");
        right.addActionListener(e -> {
            x += 5;
            canvasPanel.repaint();
        });

        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(repaint);
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(exit);

        add(canvasPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void randomXYColor() {
        color = COLORS[random.nextInt(COLORS.length)];
        x = random.nextInt(CANVAS_WIDTH - DX);
        y = random.nextInt(CANVAS_HEIGTH - DX);
        dx = DX;
    }

    private void initBalls() {
        balls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Color color = COLORS[random.nextInt(COLORS.length)];
            int d = random.nextInt(100);
            int x = random.nextInt(CANVAS_WIDTH - d);
            int y = random.nextInt(CANVAS_HEIGTH - d);
            balls.add(new Ball(x, y, d, color));
        }
    }

    private class CanvasPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
                ball.paint(g);
            }
        }
    }
}

