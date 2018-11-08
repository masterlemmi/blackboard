package com.masterlemmi.letters.impl;

import com.masterlemmi.letters.Letter;

import java.awt.*;

public class LetterA extends Letter {
    private String key = "A";

    @Override
    public void generateInkPoints() {
        Point point = new Point(7,5);
        Point point2 = new Point(8,5);
        Point point3 = new Point(9,5);
        Point point4 = new Point(10,5);
        Point point5 = new Point(11,5);



        this.inkPoints.add(point);
        this.inkPoints.add(point5);
        this.inkPoints.add(point2);
        this.inkPoints.add(point3);
        this.inkPoints.add(point4);
    }
}
