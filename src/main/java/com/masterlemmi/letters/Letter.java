package com.masterlemmi.letters;

import java.awt.*;
import java.util.Collection;
import java.util.HashSet;

public abstract class Letter {
    protected Collection<Point> inkPoints = new HashSet<>();
    protected Point startPoint;
    private int height;
    private int width;

    public Collection<Point> getPoints() {
        return this.inkPoints;
    }

    public void setSize(int w, int h) {
        this.height = h;
        this.width = w;
    }

    public void setStartPoint(Point p) {
        this.startPoint = p;
    }

    public abstract void generateInkPoints();
}
