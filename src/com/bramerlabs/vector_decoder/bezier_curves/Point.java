package com.bramerlabs.vector_decoder.bezier_curves;

import java.awt.*;

public class Point {

    public final static int radius = 7;

    private float x, y;
    private final Color color = new Color(58, 175, 160);

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) {
        g.setColor(this.color);
        g.fillOval((int) x - radius, (int) y - radius, 2 * radius, 2 * radius);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
}
