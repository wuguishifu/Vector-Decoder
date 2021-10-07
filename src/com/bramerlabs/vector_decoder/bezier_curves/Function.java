package com.bramerlabs.vector_decoder.bezier_curves;

import java.util.Arrays;

public class Function {

    public static Point bezier(float t, Point[] p) {
        float x = bezierX(t, p);
        float y = bezierY(t, p);
        return new Point(x, y);
    }

    public static float bezierX(float t, Point[] p) {
        if (p.length == 1) {
            return p[0].getX();
        }
        return t * bezierX(t, Arrays.copyOfRange(p, 1, p.length)) + (1 - t) *
                bezierX(t, Arrays.copyOf(p, p.length - 1));
    }

    public static float bezierY(float t, Point[] p) {
        if (p.length == 1) {
            return p[0].getY();
        }
        return t * bezierY(t, Arrays.copyOfRange(p, 1, p.length)) + (1 - t) *
                bezierY(t, Arrays.copyOf(p, p.length - 1));
    }

}
