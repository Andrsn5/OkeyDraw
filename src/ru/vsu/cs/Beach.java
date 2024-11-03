package ru.vsu.cs;

import java.awt.*;

public class Beach {

    private int h;
    private int w;
    public Beach(int h, int w) {
        this.h=h;
        this.w=w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void draw(Graphics2D g2d){
    g2d.setColor(new Color(244, 164, 96));

    int[] xPoints = new int[w + 2];
    int[] yPoints = new int[w + 2];


    for (int i = 0; i < w; i++) {
        xPoints[i] = i;
        yPoints[i] = (int) (3 * h / 4 + 40 * Math.sin(i * 0.01));
    }


    xPoints[w] = w;
    yPoints[w] = h;

    xPoints[w + 1] = 0;
    yPoints[w + 1] = h;


    Polygon shoreLine = new Polygon(xPoints, yPoints, w + 2);


    g2d.fillPolygon(shoreLine);


    g2d.setColor(new Color(255, 255, 255));
    g2d.setStroke(new BasicStroke(20));
    g2d.drawPolyline(xPoints, yPoints, w);
}

}
