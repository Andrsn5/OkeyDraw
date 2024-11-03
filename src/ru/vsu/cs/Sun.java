package ru.vsu.cs;

import java.awt.*;

public class Sun {
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Sun(int y, int x, int r, int l, int n, Color c) {
        this.y = y;
        this.x = x;
        this.r = r;
        this.l = l;
        this.n = n;
        this.c = c;
    }

    private int x;
    private int r;
    private int l;
    private int n;
    private Color c;


    public void draw(Graphics2D g) {
        g.setPaint(c);
        g.fillOval(x - r, y - r, r * 2, r * 2);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = da * i;
            double x1 = r * Math.cos(a);
            double y1 = r * Math.sin(a);
            double x2 = (r + l) * Math.cos(a);
            double y2 = (r + l) * Math.sin(a);
            g.drawLine((int) (x1 + x), (int) (y1 + y), (int) (x2 + x), (int) (y2 + y));
        }
    }


}