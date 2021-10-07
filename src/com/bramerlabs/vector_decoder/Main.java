package com.bramerlabs.vector_decoder;

import com.bramerlabs.vector_decoder.bezier_curves.Curve;
import com.bramerlabs.vector_decoder.bezier_curves.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Main {

    private static JFrame frame;
    private static JPanel panel;

    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private static boolean run = true;

    private static ArrayList<Curve> curves;

    public static void main(String[] args) {
        curves = new ArrayList<>();
        curves.addAll(Decoder.decode());

        Dimension windowSize = new Dimension(screenSize.width / 2, screenSize.height / 2);
        frame = new JFrame();
        frame.setSize(windowSize);
        frame.setLocationRelativeTo(null);

        panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                for (Curve curve : curves) {
                    curve.paint(g);
                }
            }
        };

        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    run = false;
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });


        while (run) {
            try {
                // don't delete these comments
                // noinspection BusyWait
                Thread.sleep(20L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        frame.dispose();

    }

}
