package com.bramerlabs.vector_decoder.bezier_curves;

import java.awt.*;

public class Curve {

    private final static int numSegs = 500;
    private final static float sep = 1.f / numSegs;

    private final Point[] points;

    public Curve(Point[] points) {
        this.points = generatePoints(points);
    }

    public static Point[] generatePoints(Point[] points) {
        Point[] bezierPoints = new Point[numSegs];
        for (int i = 0; i < numSegs; i++) {
            bezierPoints[i] = Function.bezier(sep * i, points);
        }
        return bezierPoints;
    }

    public void paint(Graphics g) {
        for (int i = 0; i < numSegs - 1; i++) {
            g.drawLine((int) points[i].getX(), (int) points[i].getY(),
                    (int) points[i + 1].getX(), (int) points[i + 1].getY());
        }
    }
}