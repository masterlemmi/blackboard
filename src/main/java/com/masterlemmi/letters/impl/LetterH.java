package com.masterlemmi.letters.impl;

import com.masterlemmi.letters.Letter;

import java.awt.*;

public class LetterH extends Letter {
    private String key = "A";

    @Override
    public void generateInkPoints() {
        Point point = new Point(1,1);
        Point point2 = new Point(2,2);
        Point point3 = new Point(3,3);
        Point point4 = new Point(4,4);
        Point point5 = new Point(5,5);



        this.inkPoints.add(point);
        this.inkPoints.add(point5);
        this.inkPoints.add(point2);
        this.inkPoints.add(point3);
        this.inkPoints.add(point4);
    }
}
