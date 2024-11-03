package ru.vsu.cs;

import java.awt.*;
import java.util.Random;


public class Mountains {
    private int h;
    private int w;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public Mountains(int h, int w){
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(new Color(90, 110, 123));


        int[] xPoints = new int[w];
        int[] yPoints = new int[w];


        int baseHeight = h / 2;
        int maxHeightVariation = 100;
        Random random = new Random();

        for (int i = 0; i < w; i++) {
            xPoints[i] = i;

            int heightVariation = random.nextInt(-maxHeightVariation, maxHeightVariation + 1);
            if (heightVariation==0) heightVariation = random.nextInt(-maxHeightVariation, maxHeightVariation + 1);
            int sineHeight = (int) (baseHeight + (70 * Math.sin(((double) i / w) * (2 * Math.PI))));
            yPoints[i] = sineHeight + heightVariation;

            if (yPoints[i] < 0) {
                yPoints[i] = 0;
            } else if (yPoints[i] > h) {
                yPoints[i] = h;
            }
        }

        Polygon mountains = new Polygon(xPoints, yPoints, w);

        g2d.fillPolygon(mountains);
    }
    }


