package ru.vsu.cs;

import java.awt.*;
import java.util.Random;

public class Mountain {
    private int h,w;
    public Mountain(int h , int w) {
        this.w=w;
        this.h=h;
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

    public  void draw(Graphics2D g2d) {
        g2d.setColor(new Color(100, 100, 100));

        int numMountains = 5;
        int minWidth = 150;
        int maxWidth = 300;
        int minHeight = 100;
        int maxHeight = 200;

        int currentX = 0;


        for (int i = 0; i < numMountains; i++) {
            Random random = new Random();
            int mountainWidth = random.nextInt(maxWidth - minWidth) + minWidth;
            int mountainHeight = random.nextInt(maxHeight - minHeight) + minHeight;

            int[] xPoints = { currentX, currentX + mountainWidth / 2, currentX + mountainWidth };
            int[] yPoints = { h / 2, h / 2 - mountainHeight, h / 2 };

            Polygon mountain = new Polygon(xPoints, yPoints, 3);
            g2d.fillPolygon(mountain);

            currentX += mountainWidth;
        }
    }}
