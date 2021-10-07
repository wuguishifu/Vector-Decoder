package com.bramerlabs.vector_decoder;

import com.bramerlabs.vector_decoder.bezier_curves.Curve;
import com.bramerlabs.vector_decoder.bezier_curves.Point;

import java.util.ArrayList;

public class Decoder {

    public static ArrayList<Curve> decode() {
        ArrayList<Curve> curves = new ArrayList<>();
        // TODO: cindy decode an svg file here into a list of curves
        //       example quadratic curve:
        curves.add(new Curve(new Point[]{
                new Point(400, 400),
                new Point(400, 600),
                new Point(600, 600),
                new Point(600, 400)
        }));
        // the curve class can handle any order curve
        return curves;
    }
}
